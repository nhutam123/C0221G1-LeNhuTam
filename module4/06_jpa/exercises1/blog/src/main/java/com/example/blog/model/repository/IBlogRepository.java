package com.example.blog.model.repository;

import com.example.blog.model.entity.Blog;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IBlogRepository extends CrudRepository<Blog,Integer> {
//    List<Blog> findAll();
//    void save(Blog blog);
//    Blog findById(int id);
}
