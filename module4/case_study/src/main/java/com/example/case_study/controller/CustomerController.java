package com.example.case_study.controller;

import com.example.case_study.model.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("")
    public String display(){
        return "customer/list";
    }
}
