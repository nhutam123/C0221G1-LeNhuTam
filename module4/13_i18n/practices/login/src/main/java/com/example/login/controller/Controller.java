package com.example.login.controller;

import com.example.login.model.entity.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("")
    public String goHome(Model model){
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping("/doLogin")
    public String login(@Valid  @ModelAttribute User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "index";
        }
        return "success";
    }
}
