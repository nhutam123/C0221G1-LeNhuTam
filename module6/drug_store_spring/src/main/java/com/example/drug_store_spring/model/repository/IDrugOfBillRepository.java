package com.example.drug_store_spring.model.repository;

import com.example.drug_store_spring.model.entity.DrugOfBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDrugOfBillRepository extends JpaRepository<DrugOfBill, Integer> {
    @Query(value = "select * from  drug_of_bill   where prescription_id = ? ;", nativeQuery = true)
    List<DrugOfBill> findAllDrugOfBill(int id);
}
