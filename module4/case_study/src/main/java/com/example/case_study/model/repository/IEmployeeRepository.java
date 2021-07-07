package com.example.case_study.model.repository;

import com.example.case_study.model.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
        @Query(value = "select * from employee where  name like:keyword",nativeQuery = true)
        public Page<Employee> findAllByNameContaining(Pageable pageable,@Param("keyword") String name);

}
