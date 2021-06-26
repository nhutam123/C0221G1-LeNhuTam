package com.example.product.model.service;

import com.example.product.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAllByNameContaining(Pageable pageable, String name);
    void save(Product product);
    Product findById(Integer id);
}
