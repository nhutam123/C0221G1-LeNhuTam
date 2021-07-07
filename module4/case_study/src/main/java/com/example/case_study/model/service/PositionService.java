package com.example.case_study.model.service;

import com.example.case_study.model.entity.Position;
import com.example.case_study.model.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService{
    @Autowired
    IPositionRepository iPositionRepository;
    @Override
    public List<Position> findAll() {
        return iPositionRepository.findAll();
    }
}
