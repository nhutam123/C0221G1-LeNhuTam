package com.example.case_study.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICommonService<T> {
    Page<T> findAll(Pageable pageable, String name);
    void save(T t);
    Optional<T> findById(Integer id);
}
