package com.example.drug_store_spring.model.repository;

import com.example.drug_store_spring.model.entity.DrugOfBill;
import com.example.drug_store_spring.model.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    @Query(value = "select * from prescription where id = ?;", nativeQuery = true)
    Prescription findById(int id);
}
