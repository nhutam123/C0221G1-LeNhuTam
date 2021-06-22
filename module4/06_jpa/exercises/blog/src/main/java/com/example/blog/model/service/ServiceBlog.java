package com.example.blog.model.service;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBlog implements IServiceBlog{
@Autowired
    IRepository iRepository;
    @Override
    public List<Blog> findAll() {
        return iRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iRepository.save(blog);
    }
}
