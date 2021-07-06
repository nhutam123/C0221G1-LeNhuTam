package com.example.case_study.model.repository;

import com.example.case_study.model.entity.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerType extends JpaRepository<CustomerType,Integer> {
}
