package com.example.drug_store_spring.model.service;

import com.example.drug_store_spring.model.entity.DrugOfBill;

import java.util.List;

public interface IDrugOfBillService {
    List<DrugOfBill> findAllDrugOfBill(int id);
}
