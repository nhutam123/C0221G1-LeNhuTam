package com.example.case_study.model.service;

import com.example.case_study.model.entity.Customer;

import java.util.List;

public interface ICustomerService extends ICommonService<Customer> {
    List<Customer> findAll();

}
