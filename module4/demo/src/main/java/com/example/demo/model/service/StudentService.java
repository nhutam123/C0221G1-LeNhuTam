package com.example.demo.model.service;

import com.example.demo.model.entity.Student;
import com.example.demo.model.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepository iStudentRepository;

    @Override
    public Page<Student> findAll(Pageable pageable, String keyword, String emailValue) {
        return iStudentRepository.findAllByNameContaining(pageable,"%"+keyword+"%","%"+emailValue +"%");
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return iStudentRepository.findById(id).orElse(null);
    }
}
