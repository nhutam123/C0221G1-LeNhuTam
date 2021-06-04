package model.service;

import model.bean.*;

import java.sql.SQLException;
import java.util.List;

public interface iEmployeeService<E> {
    public List<E> selectAll();
    public void insert(Employee employee) throws SQLException;
    public Employee select(int id);
    public void update(Employee employee);
    public void delete(int id);
    public Degree selectDegree(int id);
    public Department selectDepartment(int id);
    public Position selectPositon(int id);
    public List<Employee> search(String name);
}
