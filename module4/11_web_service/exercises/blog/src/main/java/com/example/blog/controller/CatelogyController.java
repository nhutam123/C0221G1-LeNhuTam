package com.example.blog.controller;

import com.example.blog.model.entity.Category;
import com.example.blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CatelogyController {
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String display(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> search){
        String keyword="";
        if (search.isPresent()){
            keyword=search.get();
        }
        Page<Category> categories=iCategoryService.findAllByName(pageable,keyword);
        model.addAttribute("categories",categories);
        return "/category/index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("category",new Category());
        return "/category/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Category category){
        iCategoryService.save(category);
        return "redirect:/category";
    }

}
