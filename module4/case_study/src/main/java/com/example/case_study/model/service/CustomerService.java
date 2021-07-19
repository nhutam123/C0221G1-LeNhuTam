package com.example.case_study.model.service;

import com.example.case_study.model.entity.Customer;
import com.example.case_study.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable, String name,String email) {
        return iCustomerRepository.findAllByNameContaining( pageable, "%"+ name+"%","%"+email+"%");
    }

    @Override
    public Page<Customer> findAll(Pageable pageable, String name) {
        return null;
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return(List<Customer>) iCustomerRepository.findAll();
    }
}
