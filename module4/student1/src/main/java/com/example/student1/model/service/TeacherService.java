package com.example.student1.model.service;

import com.example.student1.model.entity.Teacher;
import com.example.student1.model.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService{
    @Autowired
    ITeacherRepository iTeacherRepository;
    @Override
    public List<Teacher> findAll() {
        return iTeacherRepository.findAll();
    }
}
