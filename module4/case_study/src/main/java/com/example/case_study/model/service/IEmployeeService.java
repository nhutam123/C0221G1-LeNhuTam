package com.example.case_study.model.service;

import com.example.case_study.model.entity.Employee;

import java.util.List;

public interface IEmployeeService extends ICommonService<Employee> {
    List<Employee> findAll();
}
