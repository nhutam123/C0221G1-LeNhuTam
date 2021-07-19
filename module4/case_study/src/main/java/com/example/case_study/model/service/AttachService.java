package com.example.case_study.model.service;

import com.example.case_study.model.repository.IAttachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachService implements IAttachService{
    @Autowired
    IAttachRepository iAttachRepository;


    @Override
    public List<com.example.case_study.model.entity.AttachService> findAll() {
        return iAttachRepository.findAll();
    }
}
