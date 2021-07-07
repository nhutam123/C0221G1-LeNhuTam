package com.example.case_study.model.repository;

import com.example.case_study.model.entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceTypeRepository extends JpaRepository<ServiceType,Integer> {

}
