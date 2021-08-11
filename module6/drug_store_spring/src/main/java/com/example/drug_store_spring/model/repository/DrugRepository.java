package com.example.drug_store_spring.model.repository;

import com.example.drug_store_spring.model.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<Drug, Integer> {

}
