package model.service;

import model.bean.Degree;
import model.bean.Department;
import model.bean.Position;
import model.bean.ServiceType;

import java.util.List;

public interface iDepartmentService<E> {
    public List<E> selectAll();
    public E select(int id);
    public Degree selectDegree(int id);
    public Department selectDepartment(int id);
    public Position selectPosition(int id);
    public ServiceType selectServiceType(int id);
}
