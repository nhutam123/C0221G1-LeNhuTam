package com.example.pages.model.repository;
import com.example.pages.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
    Page<Customer> findAllByNameContaining(String firstname, Pageable pageable);
}
