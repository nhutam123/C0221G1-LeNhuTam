package com.codegym.model.repository;

import com.codegym.model.entity.Customer;

public interface iCustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
