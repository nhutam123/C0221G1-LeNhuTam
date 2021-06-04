package model.service;

import model.bean.Customer;
import model.repository.CustomerRepository;

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

    @Override
    public void delete(int id) {
        service.delete(id);
    }

    @Override
    public List<Customer> search(String name) {
        return service.search(name);
    }


}
