package model.service;

import model.bean.Degree;
import model.bean.Department;
import model.bean.Position;
import model.bean.ServiceType;
import model.repository.DepartmentRepo;

import java.util.List;

public class DepartmentSevice implements iDepartmentService {
    DepartmentRepo repo=new DepartmentRepo();

    @Override
    public List<Department> selectAll() {
        return repo.selectAll();
    }

    @Override
    public Object select(int id) {
        return null;
    }

    @Override
    public Degree selectDegree(int id) {
        return null;
    }

    @Override
    public Department selectDepartment(int id) {
        return repo.selectDpartment(id);
    }

    @Override
    public Position selectPosition(int id) {
        return null;
    }

    @Override
    public ServiceType selectServiceType(int id) {
        return null;
    }
}
