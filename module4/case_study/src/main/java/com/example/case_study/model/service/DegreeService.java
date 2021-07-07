package com.example.case_study.model.service;

import com.example.case_study.model.entity.Degree;
import com.example.case_study.model.repository.IDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeService implements IDegreeService{
    @Autowired
    IDegreeRepository iDegreeRepository;
    @Override
    public List<Degree> findAll() {
        return iDegreeRepository.findAll();
    }
}
