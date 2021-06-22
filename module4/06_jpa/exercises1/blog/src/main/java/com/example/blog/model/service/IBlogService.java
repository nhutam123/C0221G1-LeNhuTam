package com.example.blog.model.service;

import com.example.blog.model.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    void save(Blog blog);

}
