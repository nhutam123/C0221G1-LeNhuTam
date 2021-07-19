package com.example.demo.model.service;

import com.example.demo.model.entity.QuestionType;
import com.example.demo.model.repository.IQuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionTypeService implements IQuestionTypeService{
    @Autowired
    IQuestionTypeRepository iQuestionTypeRepository;
    @Override
    public List<QuestionType> findAll() {
        return iQuestionTypeRepository.findAll();
    }
}
