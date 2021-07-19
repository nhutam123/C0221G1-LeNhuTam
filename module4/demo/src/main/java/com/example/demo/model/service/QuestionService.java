package com.example.demo.model.service;

import com.example.demo.model.entity.Question;
import com.example.demo.model.repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements IQuestionService{
    @Autowired
    IQuestionRepository iQuestionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable, String keyword, String emailValue) {
        return iQuestionRepository.findAllByNameContaining(pageable,"%"+keyword+"%","%"+emailValue+"%");
    }

    @Override
    public void save(Question question) {
        iQuestionRepository.save(question);

    }

    @Override
    public Question findById(Integer id) {
        return iQuestionRepository.findById(id).orElse(null);
    }
}
