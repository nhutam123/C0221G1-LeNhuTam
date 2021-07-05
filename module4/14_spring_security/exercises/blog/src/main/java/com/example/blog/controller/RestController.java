package com.example.blog.controller;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import com.example.blog.model.service.IBlogService;
import com.example.blog.model.service.ICategoryService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
@CrossOrigin
public class RestController {
    @Autowired
    IBlogService iBlogService;

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = {"/","/search"})

    public ResponseEntity<Page<Blog>> display(@RequestParam Optional<String> search,@RequestParam int page ){
        String keyword="";
        if (search.isPresent()){
            keyword=search.get();
        }
        Page<Blog> blogPage=iBlogService.findAllByAuthorContaining(PageRequest.of(page,2),keyword);
        if (blogPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
         return new ResponseEntity<>(blogPage,HttpStatus.OK);
    }
    @GetMapping("/category")
    public ResponseEntity<List<Category>> showCategorylist(){
        List<Category> list=iCategoryService.findAll();
        if (list.isEmpty()){
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new  ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> showBlogDetail(@PathVariable Integer id){
        Blog blog=iBlogService.findById(id);
        if (blog==null){
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<List<Blog>> showListBlogOfCtegory(@PathVariable Integer id){
        List<Blog> blogList=iBlogService.findByCategoryId(id);
        if (blogList.isEmpty()){
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
}
