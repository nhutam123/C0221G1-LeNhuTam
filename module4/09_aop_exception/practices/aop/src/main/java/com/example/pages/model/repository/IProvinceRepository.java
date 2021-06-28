package com.example.pages.model.repository;

import com.example.pages.model.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProvinceRepository extends JpaRepository<Province,Integer> {
}
