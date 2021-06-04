package model.service;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface iCustomerSevice<E> {
 public List<E> selectAll();
 public void insertCustomer(Customer customer) throws SQLException;
 public Customer selectCustomer(int id);
 public void update(Customer customer);
 public void delete(int id);
 public List<Customer> search(String name);
}

