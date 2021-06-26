package com.example.product.model.service;

import com.example.product.model.entity.Product;
import com.example.product.model.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public Page<Product> findAllByNameContaining(Pageable pageable, String name) {
        return iProductRepository.findAllByNameContaining(pageable,"%"+name+"%");
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        iProductRepository.deleteById(id);
    }
}
