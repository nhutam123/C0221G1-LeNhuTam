package com.example.student1.model.service;

import com.example.student1.model.entity.Student;
import com.example.student1.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
}
