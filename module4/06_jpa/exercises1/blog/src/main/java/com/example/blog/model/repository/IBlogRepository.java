package com.example.blog.model.repository;

import com.example.blog.model.entity.Blog;

import java.util.List;

public interface IBlogRepository {
    List<Blog> findAll();
    void save(Blog blog);
    Blog findById(int id);
}
