package com.codegym.cms.model.repository;

import com.codegym.cms.model.entity.Customer;

import java.util.List;

public interface IGeneralRepository<T> {
    List<T> findAll();

    Customer findById(Long id);

    void save(T t);

    void remove(Long id);
}
