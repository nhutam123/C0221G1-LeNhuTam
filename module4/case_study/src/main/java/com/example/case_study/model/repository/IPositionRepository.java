package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Integer> {
}
