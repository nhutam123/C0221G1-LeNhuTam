package model.service;

import model.bean.Degree;
import model.bean.Department;
import model.bean.Employee;
import model.bean.Position;
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
    public void insert(Employee employee) throws SQLException {
        employeeRepo.insert(employee);

    }

    @Override
    public Employee select(int id) {
        return employeeRepo.select(id);
    }

    @Override
    public void update(Employee employee) {
        employeeRepo.update(employee);

    }

    @Override
    public void delete(int id) {
        employeeRepo.delete(id);

    }

    @Override
    public Degree selectDegree(int id) {
        return employeeRepo.selectDegree(id);
    }

    @Override
    public Department selectDepartment(int id) {
        return employeeRepo.selectDepartment(id);
    }

    @Override
    public Position selectPositon(int id) {
        return employeeRepo.selectPosition(id);
    }

    @Override
    public List<Employee> search(String name) {
        return employeeRepo.search(name);
    }
}
