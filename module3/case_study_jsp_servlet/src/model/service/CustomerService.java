package model.service;

import model.bean.Customer;
import model.bean.CustomerType;
import model.repository.CustomerRepository;
import model.repository.CustomerTypeRepo;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements iCustomerSevice {
    CustomerRepository service=new CustomerRepository();

    @Override
    public List<Customer> selectAll() {
        return service.selectAll();
    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        service.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return service.selectCustomer(id);
    }

    @Override
    public void update(Customer customer) {
        service.update(customer);
    }


}
