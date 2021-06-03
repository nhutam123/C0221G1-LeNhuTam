package model.service;

import model.bean.Employee;
import model.repository.EmployeeRepo;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements iEmployeeService {
    EmployeeRepo employeeRepo=new EmployeeRepo();
    @Override
    public List<Employee> selectAll() {
        return employeeRepo.selectAll();
    }

    @Override
    public void insertCustomer(Employee employee) throws SQLException {

    }

    @Override
    public Employee selectCustomer(int id) {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
