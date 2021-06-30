package com.example.blog.controller;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import com.example.blog.model.service.IBlogService;
import com.example.blog.model.service.ICategoryService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = {"/","/search"})
    public String display(@RequestParam Optional<String> search,@PageableDefault(size = 3) Pageable pageable, Model model){
        String keyword="";
        if (search.isPresent()){
            keyword=search.get();
        }
        Page<Blog> blogPage=iBlogService.findAllByAuthorContaining(pageable,keyword);
        model.addAttribute("listBlog",blogPage);
        model.addAttribute("keyword",keyword);
        return "/blog/index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("blog",new Blog());
        List<Category> list=iCategoryService.findAll();
        model.addAttribute("listCategory",list);
        return "/blog/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog){
       blog.setDate(new java.util.Date());
        iBlogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam Integer id, Model model){
        Blog blog=iBlogService.findById(id);
        model.addAttribute("blog",blog);
        List<Category> list=iCategoryService.findAll();
        model.addAttribute("listCategory",list);
        return "/blog/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/delete")
    public  String showDeleteForm(@RequestParam Integer id, Model model){
        Blog blog=iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "/blog/delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Integer id){
        iBlogService.delete(id);
        return "redirect:/blog/";
    }

}
