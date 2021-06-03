package model.service;

import model.bean.Customer;
import model.bean.CustomerType;
import model.repository.CustomerTypeRepo;

import java.sql.SQLException;
import java.util.List;

public class CustomerTypeService implements iCustomerSevice {
    CustomerTypeRepo customerTypeRepo=new CustomerTypeRepo();
    @Override
    public List<CustomerType> selectAll() {
        return customerTypeRepo.selectAll();
    }

    @Override
    public void insertCustomer(Customer o) throws SQLException {

    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }

}
