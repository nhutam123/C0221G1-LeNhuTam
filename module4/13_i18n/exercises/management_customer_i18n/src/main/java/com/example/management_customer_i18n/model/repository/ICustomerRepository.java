package com.example.management_customer_i18n.model.repository;
import com.example.management_customer_i18n.model.entity.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
    Page<Customer> findAllByNameContaining(String firstname, Pageable pageable);
}
