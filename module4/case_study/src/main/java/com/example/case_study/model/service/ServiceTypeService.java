package com.example.case_study.model.service;

import com.example.case_study.model.entity.ServiceType;
import com.example.case_study.model.repository.IServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService{
    @Autowired
    IServiceTypeRepository iServiceTypeService;
    @Override
    public List<ServiceType> findAll() {
        return iServiceTypeService.findAll();
    }
}
