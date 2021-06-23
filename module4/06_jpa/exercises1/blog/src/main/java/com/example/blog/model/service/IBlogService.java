package com.example.blog.model.service;

import com.example.blog.model.entity.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();
    void save(Blog blog);
    Optional<Blog> findById(Integer id);
    void exists(Integer id);
    void delete(Integer id);


}
