package com.example.case_study.model.service;

import com.example.case_study.model.entity.Employee;
import com.example.case_study.model.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    IEmployeeRepository iEmployeeRepository;
    @Override
    public Page<Employee> findAll(Pageable pageable, String name) {
        return iEmployeeRepository.findAllByNameContaining(pageable,"%"+name+"%");
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);

    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return Optional.empty();
    }
}
