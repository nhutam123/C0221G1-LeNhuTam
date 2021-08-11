package com.example.drug_store_spring.model.service;

import com.example.drug_store_spring.model.entity.DrugOfBill;
import com.example.drug_store_spring.model.repository.IDrugOfBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class DrugOfBillService implements IDrugOfBillService{
    @Autowired
    IDrugOfBillRepository iDrugOfBillRepository;
    @Override
    public List<DrugOfBill> findAllDrugOfBill(int id) {
        return iDrugOfBillRepository.findAllDrugOfBill(id);
    }
}
