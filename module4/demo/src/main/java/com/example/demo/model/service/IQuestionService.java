package com.example.demo.model.service;

import com.example.demo.model.entity.Question;
import com.example.demo.model.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuestionService {
    Page<Question> findAll(Pageable pageable, String keyword, String emailValue);
    void save(Question question);
    Question findById(Integer id);
}
