package model.service;

import model.bean.Customer;
import model.bean.CustomerType;
import model.repository.CustomerTypeRepo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerTypeService implements iCustomerSevice {
    CustomerTypeRepo customerTypeRepo=new CustomerTypeRepo();
    @Override
    public List<CustomerType> selectAll() {
        return customerTypeRepo.selectAll();
    }

    @Override
    public Map<String,String> insertCustomer(Customer o) throws SQLException {
        Map<String,String> map=new HashMap<>();
        return map;
    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public CustomerType selectType(int id) {
        return customerTypeRepo.selectType(id);
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Customer> search(String name) {
        return null;
    }

}
