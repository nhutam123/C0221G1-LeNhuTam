package com.example.case_study.model.service;

import com.example.case_study.model.entity.CustomerType;
import com.example.case_study.model.repository.ICustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerType iCustomerType;
    @Override
    public List<CustomerType> findAll() {
        return iCustomerType.findAll();
    }
}
