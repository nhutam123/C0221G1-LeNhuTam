package com.example.blog.controller;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    IBlogService iBlogService;
    @RequestMapping("")
    public String display(Model model){
        List<Blog> list=iBlogService.findAll();
        model.addAttribute("listBlog",list);
        return "/index";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("blog",new Blog());
        return "/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog){
        iBlogService.save(blog);
        return "redirect:";
    }

}
