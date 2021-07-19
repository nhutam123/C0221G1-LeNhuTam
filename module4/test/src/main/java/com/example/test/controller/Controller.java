package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/home")
public class Controller {
    @GetMapping("")
    public String goHome(){
        return "index";
    }
}
