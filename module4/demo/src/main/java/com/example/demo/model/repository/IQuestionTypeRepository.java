package com.example.demo.model.repository;

import com.example.demo.model.entity.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionTypeRepository extends JpaRepository<QuestionType,Integer> {
}
