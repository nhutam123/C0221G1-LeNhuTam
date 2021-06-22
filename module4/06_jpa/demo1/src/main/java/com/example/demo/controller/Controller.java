package com.example.demo.controller;

import com.example.demo.model.entity.Customer;
import com.example.demo.model.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    IService iService;
    @RequestMapping("")
    public String display(Model model){
       List<Customer> list= iService.findAll();
       model.addAttribute("list",list);
        return "/index";
    }
}
