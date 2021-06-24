package com.example.province.model.repository;

import com.example.province.model.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProvinceRepository extends JpaRepository<Province,Integer> {
}
