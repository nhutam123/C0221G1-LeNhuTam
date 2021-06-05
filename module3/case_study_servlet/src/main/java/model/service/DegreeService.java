package model.service;

import model.bean.Degree;
import model.bean.Department;
import model.bean.Position;
import model.repository.DegreeRepo;

import java.util.List;

public class DegreeService implements iDepartmentService {
    DegreeRepo degreeRepo=new DegreeRepo();
    @Override
    public List<Degree> selectAll() {
        return degreeRepo.selectAll();
    }

    @Override
    public Object select(int id) {
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

    @Override
    public Degree selectDegree(int id) {
        return degreeRepo.selectDegree(id);
    }
}
