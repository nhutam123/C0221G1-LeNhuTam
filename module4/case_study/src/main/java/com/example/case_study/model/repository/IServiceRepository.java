package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Customer;
import com.example.case_study.model.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IServiceRepository extends PagingAndSortingRepository<Service,Integer> {
    @Query(value = "select * from service where service_name like:keyword",nativeQuery = true)
    Page<Service> findAllByNameContaining(Pageable pageable, @Param("keyword") String name);
}
