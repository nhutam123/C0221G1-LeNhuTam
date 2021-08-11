package com.example.drug_store_spring.model.service;

import com.example.drug_store_spring.model.entity.Drug;
import com.example.drug_store_spring.model.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class DrugService implements IDrugService{
    @Autowired
    DrugRepository drugRepository;
    @Override
    public List<Drug> findAll() {
        return this.drugRepository.findAll();
    }
}
