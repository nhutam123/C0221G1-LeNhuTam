package com.codegym.model.service;

import com.codegym.model.entity.Customer;

public interface iCustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
