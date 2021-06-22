package com.codegym.cms.model.service;

import com.codegym.cms.model.entity.Customer;

import java.util.List;

public interface IGeneralService<T> {
    List<T> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
