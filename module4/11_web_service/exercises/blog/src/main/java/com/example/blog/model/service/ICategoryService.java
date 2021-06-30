package com.example.blog.model.service;

import com.example.blog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Page<Category> findAllByName(Pageable pageable,String keyword);
    void save(Category category);
}
