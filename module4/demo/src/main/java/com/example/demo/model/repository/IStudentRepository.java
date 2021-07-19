package com.example.demo.model.repository;

import com.example.demo.model.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IStudentRepository extends PagingAndSortingRepository<Student,Integer> {
    @Query(value = "select * from student where flag = 1 and `name` like:keyword and email like :email",nativeQuery = true)
    Page<Student> findAllByNameContaining(Pageable pageable, @Param("keyword") String name, @Param("email") String email);
}

