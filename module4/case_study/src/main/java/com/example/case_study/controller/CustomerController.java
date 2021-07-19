package com.example.case_study.controller;

import com.example.case_study.dto.CustomerDto;
import com.example.case_study.model.entity.Customer;
import com.example.case_study.model.entity.CustomerType;
import com.example.case_study.model.service.ICustomerService;
import com.example.case_study.model.service.ICustomerTypeService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    ICustomerTypeService iCustomerTypeService;
    @GetMapping(value = {"","/search"})
    public String display(Model model , @PageableDefault(size = 5) Pageable pageable,@RequestParam Optional<String> search,@RequestParam("email") Optional<String> email){
        String keyword="";
        String emailValue="";
        if (search.isPresent()){
            keyword=search.get();
        }
        if (email.isPresent()){
            emailValue=email.get();
        }
        Page<Customer> customerPage=iCustomerService.findAll(pageable,keyword,emailValue);
        model.addAttribute("customerPage",customerPage);
        model.addAttribute("keyword",keyword);
        return "customer/list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("customerDto",new CustomerDto());
        List<CustomerType> typeList =iCustomerTypeService.findAll();
        model.addAttribute("typeList",typeList);
        return "customer/create";
    }
    @PostMapping(value = "/create")
    public String create(@Valid  @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "customer/create";
        }
        customerDto.setFlag(1);
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        iCustomerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping(value = "/edit")
    public String showEditForm(Model model , @RequestParam("id") Integer id){
        Optional<Customer> customer=iCustomerService.findById(id);
        CustomerDto customerDto=new CustomerDto();
        BeanUtils.copyProperties(customer.get(),customerDto);
        model.addAttribute("customerDto",customerDto);
        List<CustomerType> typeList =iCustomerTypeService.findAll();
        model.addAttribute("typeList",typeList);
        return "/customer/edit";
    }

    @PostMapping(value = "/edit")
    public  String edit(@ModelAttribute("customerDto") CustomerDto customerDto,BindingResult bindingResult,Model model){
        if (bindingResult.hasFieldErrors()){
            return "/customer/edit";
        }
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        iCustomerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/delete")
    public String showDeleteForm(Model model,@RequestParam("id") Integer id){
        Customer customer=iCustomerService.findById(id).orElse(null);
        model.addAttribute("customer",customer);
        return "/customer/delete";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam("id") Integer id){
        Customer customer=iCustomerService.findById(id).orElse(null);
        customer.setFlag(0);
        iCustomerService.save(customer);
        return "redirect:/customer";
    }
}
