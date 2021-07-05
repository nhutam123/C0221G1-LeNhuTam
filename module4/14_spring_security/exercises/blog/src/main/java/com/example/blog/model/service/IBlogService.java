package com.example.blog.model.service;

import com.example.blog.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void  save(Blog blog);
    Blog findById(Integer id);
    void delete(Integer id);
    Page<Blog> findAllByAuthorContaining(Pageable pageable,String keyword);
    List<Blog> findByCategoryId(Integer id);
}
