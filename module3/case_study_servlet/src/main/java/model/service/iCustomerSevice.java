package model.service;

import model.bean.Customer;
import model.bean.CustomerType;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface iCustomerSevice<E> {
 public List<E> selectAll();
 public Map<String,String> insertCustomer(Customer customer) throws SQLException;
 public Customer selectCustomer(int id);
 public void update(Customer customer);
 public void delete(int id);
 public List<Customer> search(String name);
 public CustomerType selectType(int id);
}

