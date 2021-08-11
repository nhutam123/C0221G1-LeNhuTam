package com.example.demo.controller;

import com.example.demo.dto.QuestionDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.model.entity.Question;
import com.example.demo.model.entity.QuestionType;
import com.example.demo.model.entity.Student;
import com.example.demo.model.service.IQuestionService;
import com.example.demo.model.service.IQuestionTypeService;
import com.example.demo.model.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
@org.springframework.stereotype.Controller
@RequestMapping("/home")
public class Controller {
    @Autowired
    IQuestionService iQuestionService;
    @Autowired
    IQuestionTypeService iQuestionTypeService;

    @GetMapping("")
    public String goHome(){
        return "index";
    }

    @GetMapping("/list")
    public String showList(Model model , @PageableDefault(size = 5) Pageable pageable, @RequestParam Optional<String> title, @RequestParam("type") Optional<String> type){
        String keyword="";
        String typeValue="";
        if (title.isPresent()){
            keyword=title.get();
        }
        if (type.isPresent()){
            typeValue=type.get();
        }
        Page<Question> questionPage=iQuestionService.findAll(pageable,keyword,typeValue);
        List<QuestionType> questionTypeList=iQuestionTypeService.findAll();
        model.addAttribute("questionPage",questionPage);
        model.addAttribute("keyword",keyword);
        model.addAttribute("typeValue",typeValue);
        model.addAttribute("questionTypeList",questionTypeList);
        return "/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){

        List<QuestionType> questionTypeList=iQuestionTypeService.findAll();
        model.addAttribute("questionTypeList",questionTypeList);
        model.addAttribute("questionDto", new QuestionDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid  @ModelAttribute("questionDto") QuestionDto questionDto,
                         BindingResult bindingResult, Model model,RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("questionDto",questionDto);
            return "/create";
        }
        Question question=new Question();
        BeanUtils.copyProperties(questionDto,question);
        question.setFlag(1);
        iQuestionService.save(question);
        redirectAttributes.addFlashAttribute("message","ngon rồi em");
        return "redirect:/home/list";

    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Integer id , RedirectAttributes redirectAttributes){
       Question question= iQuestionService.findById(id);
       question.setFlag(0);
       iQuestionService.save(question);
       redirectAttributes.addFlashAttribute("message","xóa ngon rồi đó em");

        return "redirect:/home/list";
    }

}
