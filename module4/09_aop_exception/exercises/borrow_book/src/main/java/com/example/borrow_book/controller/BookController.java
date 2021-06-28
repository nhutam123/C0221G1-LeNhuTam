package com.example.borrow_book.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BookController {
    @GetMapping("")
    public String display(){
        return "index";
    }
}
