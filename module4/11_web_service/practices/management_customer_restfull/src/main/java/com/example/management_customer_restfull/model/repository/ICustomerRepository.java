package com.example.management_customer_restfull.model.repository;

import com.example.management_customer_restfull.model.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
