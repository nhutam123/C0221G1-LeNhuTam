package com.example.pages.model.service;

import com.example.pages.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    Customer findById(Integer id);
    void delete(Integer id);
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);

}
