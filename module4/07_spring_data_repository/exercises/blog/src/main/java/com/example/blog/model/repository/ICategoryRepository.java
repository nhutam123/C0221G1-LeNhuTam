package com.example.blog.model.repository;

import com.example.blog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    @Query(value = "select * from category where name like :keyword",nativeQuery = true)
    Page<Category> findAllByName(Pageable pageable,@Param("keyword") String keyword);
}
