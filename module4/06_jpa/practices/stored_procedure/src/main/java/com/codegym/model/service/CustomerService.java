package com.codegym.model.service;

import com.codegym.model.entity.Customer;
import com.codegym.model.repository.iCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService implements iCustomerService {
    @Autowired
    private iCustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }
}
