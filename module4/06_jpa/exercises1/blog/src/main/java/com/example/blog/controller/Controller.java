package com.example.blog.controller;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    IBlogService iBlogService;
    @RequestMapping("")
    public String display(Model model){
        Iterable<Blog> list=iBlogService.findAll();
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
    @GetMapping("/edit")
    public  String showEditForm(@RequestParam Integer id,Model model){
        Optional<Blog> blog=iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "/edit";
    }
    @PostMapping("edit")
    public String edit(@ModelAttribute Blog blog){
        iBlogService.save(blog);
        return "redirect:";
    }
    @GetMapping("delete")
    public String showDeleteForm(@RequestParam Integer id, Model model){
       Optional<Blog> blog=iBlogService.findById(id);
       model.addAttribute("blog",blog);
        return "/delete";
    }
    @PostMapping("delete")
    public String delete(@RequestParam Integer id){
        iBlogService.delete(id);
        return "redirect:";
    }

}
