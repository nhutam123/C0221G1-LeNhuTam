package com.example.drug_store_spring.model.service;

import com.example.drug_store_spring.model.entity.DrugOfBill;
import com.example.drug_store_spring.model.entity.Prescription;

import java.util.List;

public interface IPrescriptionService {
    List<Prescription> findAll();

    Prescription findById(int id);
}
