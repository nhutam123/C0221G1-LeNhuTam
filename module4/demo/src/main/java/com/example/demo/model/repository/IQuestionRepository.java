package com.example.demo.model.repository;

import com.example.demo.model.entity.Question;
import com.example.demo.model.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IQuestionRepository extends PagingAndSortingRepository<Question,Integer> {
    @Query(value = "select * from question where flag = 1 and title like:keyword and question_type_id like :type order by date_create" ,nativeQuery = true)
    Page<Question> findAllByNameContaining(Pageable pageable, @Param("keyword") String title, @Param("type") String type);
}
