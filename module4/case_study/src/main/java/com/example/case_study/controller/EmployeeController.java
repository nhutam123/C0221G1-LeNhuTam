package com.example.case_study.controller;

import com.example.case_study.dto.EmployeeDto;
import com.example.case_study.model.entity.Degree;
import com.example.case_study.model.entity.Division;
import com.example.case_study.model.entity.Employee;
import com.example.case_study.model.entity.Position;
import com.example.case_study.model.service.IDegreeService;
import com.example.case_study.model.service.IDivisionService;
import com.example.case_study.model.service.IEmployeeService;
import com.example.case_study.model.service.IPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IPositionService iPositionService;
    @Autowired
    IDegreeService iDegreeService;
    @Autowired
    IDivisionService iDivisionService;

    @GetMapping(value = {"","/search"})
    public String display(@PageableDefault(size = 5)Pageable pageable, @RequestParam Optional<String> search, Model model){
        String keyword="";
        if (search.isPresent()){
            keyword=search.get();
        }
        Page<Employee> employeePage=iEmployeeService.findAll(pageable,keyword);
        model.addAttribute("employeePage",employeePage);
        model.addAttribute("keyword",keyword);
        return "employee/list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        List<Position> positionList=iPositionService.findAll();
        List<Degree> degreeList=iDegreeService.findAll();
        List<Division> divisionList=iDivisionService.findAll();
        model.addAttribute("positionList",positionList);
        model.addAttribute("degreeList",degreeList);
        model.addAttribute("divisionList",divisionList);
        model.addAttribute("employeeDto",new EmployeeDto());
        return "employee/create";
    }
    @PostMapping("/create")
    public String create(@Valid  @ModelAttribute("employeeDto") EmployeeDto employeeDto, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "/employee/create";
        }
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        iEmployeeService.save(employee);
        return "redirect:/employee";
    }

}
