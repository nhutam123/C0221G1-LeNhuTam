package com.example.drug_store_spring.model.service;

import com.example.drug_store_spring.model.entity.Drug;

import java.util.List;

public interface IDrugService {
    List<Drug> findAll();

}
