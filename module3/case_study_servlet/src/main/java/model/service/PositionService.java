package model.service;

import model.bean.Degree;
import model.bean.Department;
import model.bean.Position;
import model.bean.ServiceType;
import model.repository.PositionRepo;

import java.util.List;

public class PositionService implements iDepartmentService {
    PositionRepo repo=new PositionRepo();
    @Override
    public List<Position> selectAll() {
        return repo.selectAll();
    }

    @Override
    public Position select(int id) {
        return repo.selectPosition(id);
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
        return repo.selectPosition(id);
    }

    @Override
    public ServiceType selectServiceType(int id) {
        return null;
    }
}
