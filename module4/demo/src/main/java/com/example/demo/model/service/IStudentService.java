package com.example.demo.model.service;

import com.example.demo.model.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService {
    Page<Student> findAll(Pageable pageable,String keyword,String emailValue);
    void save(Student student);
    Student findById(Integer id);
}
