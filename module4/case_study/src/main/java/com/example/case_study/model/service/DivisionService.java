package com.example.case_study.model.service;

import com.example.case_study.model.entity.Division;
import com.example.case_study.model.repository.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService{
    @Autowired
    IDivisionRepository iDivisionRepository;
    @Override
    public List<Division> findAll() {
        return iDivisionRepository.findAll();
    }
}
