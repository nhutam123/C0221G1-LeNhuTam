package com.example.case_study.model.service;

import com.example.case_study.model.entity.Service;
import com.example.case_study.model.repository.IServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceService implements IServiceService{
    @Autowired
    IServiceRepository iServiceRepository;

    @Override
    public Page<Service> findAll(Pageable pageable, String name, String email) {
        return null;
    }

    @Override
    public Page<Service> findAll(Pageable pageable, String name) {
        return iServiceRepository.findAllByNameContaining(pageable,"%"+name+"%");
    }

    @Override
    public void save(Service service) {
        iServiceRepository.save(service);

    }

    @Override
    public Optional<Service> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Service> findAll() {
        return (List<Service>) iServiceRepository.findAll();
    }
}
