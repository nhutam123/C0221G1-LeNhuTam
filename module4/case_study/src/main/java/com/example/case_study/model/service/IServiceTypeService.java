package com.example.case_study.model.service;

import com.example.case_study.model.entity.ServiceType;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> findAll();
}
