package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
    @Query(value = "select * from customer where flag = 1 and `name` like:keyword",nativeQuery = true)
    Page<Customer> findAllByNameContaining(Pageable pageable,@Param("keyword") String name);
}
