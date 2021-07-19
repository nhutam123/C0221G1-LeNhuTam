package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
    @Query(value = "select * from customer where flag = 1 and concat(`name`,id) like:keyword and email like :email",nativeQuery = true)
    Page<Customer> findAllByNameContaining(Pageable pageable,@Param("keyword") String name,@Param("email") String email);
}
