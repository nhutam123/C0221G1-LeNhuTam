package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division,Integer> {

}
