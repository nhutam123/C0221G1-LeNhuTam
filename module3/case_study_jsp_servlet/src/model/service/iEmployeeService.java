package model.service;

import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface iEmployeeService<E> {
    public List<E> selectAll();
    public void insertCustomer(Employee employee) throws SQLException;
    public Employee selectCustomer(int id);
    public void update(Employee employee);
    public void delete(int id);
}
