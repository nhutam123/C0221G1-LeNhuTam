package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IContractRepository extends PagingAndSortingRepository<Contract,Integer> {
    @Query(value ="select * from contract where start_time like:keyword",nativeQuery = true )
    Page<Contract> findAllByNameContaining(Pageable pageable,@Param("keyword") String name);
}
