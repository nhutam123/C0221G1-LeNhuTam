package model.service;

import model.bean.Student;
import model.repository.StudentRepo;

import java.util.List;

public class StudentService implements iStudentSerrvice {
    StudentRepo repo=new StudentRepo();
    @Override
    public List<Student> selectAll() {
        return repo.selectAll();
    }
}
