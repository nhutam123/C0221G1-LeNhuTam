package model.service;

import model.bean.Degree;
import model.bean.Department;
import model.bean.Position;
import model.bean.ServiceType;
import model.repository.ServiceTypeRepo;

import java.util.List;

public class ServiceTypeService implements iDepartmentService {

    ServiceTypeRepo repo=new ServiceTypeRepo();
    @Override
    public List selectAll() {
        return repo.selectAll();
    }

    @Override
    public ServiceType selectServiceType(int id) {
        return repo.selectType(id);
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
        return null;
    }

    @Override
    public Position selectPosition(int id) {
        return null;
    }

}
