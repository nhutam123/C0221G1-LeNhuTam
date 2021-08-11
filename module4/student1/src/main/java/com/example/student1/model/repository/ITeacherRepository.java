package com.example.student1.model.repository;

import com.example.student1.model.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<Teacher, Integer> {
}
