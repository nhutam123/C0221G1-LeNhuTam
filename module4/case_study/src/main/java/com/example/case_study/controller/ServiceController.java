package com.example.case_study.controller;

import com.example.case_study.dto.ServiceDto;
import com.example.case_study.model.entity.Service;
import com.example.case_study.model.entity.ServiceType;
import com.example.case_study.model.service.ICustomerTypeService;
import com.example.case_study.model.service.IServiceService;
import com.example.case_study.model.service.IServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/service")
public class ServiceController {
    @Autowired
    IServiceService iServiceService;
    @Autowired
    IServiceTypeService iServiceTypeService;
    @GetMapping("")
    public String display(Model model, @PageableDefault(size = 5) Pageable pageable, @RequestParam Optional<String> search){
        String keyword="";
        if (search.isPresent()){
            keyword=search.get();
        }
        Page<Service> servicePage=iServiceService.findAll(pageable,keyword);
        model.addAttribute("servicePage",servicePage);
        model.addAttribute("keyword",keyword);


        return "/service/list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("serviceDto",new ServiceDto());
        List<ServiceType> typeList =iServiceTypeService.findAll();
        model.addAttribute("typeList",typeList);
        return "service/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("serviceDto") ServiceDto serviceDto,BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "/service/create";
        }
        Service service=new Service();
        BeanUtils.copyProperties(serviceDto,service);
        iServiceService.save(service);
        return "redirect:/service";
    }

}
