package model.service;

import model.bean.Customer;
import model.bean.CustomerType;
import model.repository.CustomerRepository;
import model.repository.CustomerTypeRepo;

import java.util.List;

public class CustomerService implements iCustomerSevice {
    CustomerRepository service=new CustomerRepository();

    @Override
    public List<Customer> selectAll() {
        return service.selectAll();
    }
}
