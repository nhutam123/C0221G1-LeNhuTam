package com.example.student1.controller;

import com.example.student1.model.entity.Student;
import com.example.student1.model.entity.Teacher;
import com.example.student1.model.service.IStudentService;
import com.example.student1.model.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @Autowired
    ITeacherService iTeacherService;
    @GetMapping("/list")
    public ResponseEntity<List<Student>> showList(){
        List<Student> list = iStudentService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);

    }
    @GetMapping("/teacher")
    public  ResponseEntity<List<Teacher>> showTeacherList(){

        List<Teacher> teacherList = iTeacherService.findAll();
        if (teacherList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new  ResponseEntity<>(teacherList, HttpStatus.OK);
    }

}
