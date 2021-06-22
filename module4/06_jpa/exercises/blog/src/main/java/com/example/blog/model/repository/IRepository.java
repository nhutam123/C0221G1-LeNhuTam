package com.example.blog.model.repository;

import com.example.blog.model.entity.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IRepository  {
    List<Blog> findAll();
    void save(Blog blog);
    Blog findById(int id);
}
