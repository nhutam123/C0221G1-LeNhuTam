package com.example.demo.model.service;

import com.example.demo.model.entity.Customer;
import com.example.demo.model.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service  implements IService{
    @Autowired
    IRepository iRepository;
    @Override
    public List<Customer> findAll() {
        return iRepository.findAll();
    }
}
