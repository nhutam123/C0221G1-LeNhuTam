package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDegreeRepository extends JpaRepository<Degree,Integer> {
}
