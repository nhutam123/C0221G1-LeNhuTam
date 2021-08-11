package com.example.drug_store_spring.model.service;

import com.example.drug_store_spring.model.entity.DrugOfBill;
import com.example.drug_store_spring.model.entity.Prescription;
import com.example.drug_store_spring.model.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService implements IPrescriptionService{
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @Override
    public List<Prescription> findAll() {
        return prescriptionRepository.findAll();
    }

    @Override
    public Prescription findById(int id) {
        return prescriptionRepository.findById(id);
    }

}
