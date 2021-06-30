package com.example.blog.model.service;

import com.example.blog.model.entity.Category;
import com.example.blog.model.repository.IBlogRepository;
import com.example.blog.model.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Page<Category> findAllByName(Pageable pageable, String keyword) {
        return iCategoryRepository.findAllByName(pageable,"%"+keyword+"%");
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }
}
