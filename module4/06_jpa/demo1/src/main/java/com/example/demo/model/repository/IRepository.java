package com.example.demo.model.repository;

import com.example.demo.model.entity.Customer;

import java.util.List;

public interface IRepository {
    List<Customer> findAll();
}
