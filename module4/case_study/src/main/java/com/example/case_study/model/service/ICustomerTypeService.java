package com.example.case_study.model.service;

import com.example.case_study.model.entity.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
