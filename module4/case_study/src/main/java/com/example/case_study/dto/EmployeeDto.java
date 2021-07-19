package com.example.case_study.dto;

import com.example.case_study.model.entity.Contract;
import com.example.case_study.model.entity.Degree;
import com.example.case_study.model.entity.Division;
import com.example.case_study.model.entity.Position;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

public class EmployeeDto {
    private Integer id;
    private String name;
    @JsonFormat( pattern = "MM/dd/yyyy")
    private Date birthday;
    private Double salary;

    private String phoneNumber;
    @Pattern(regexp = "^[a-zA-Z0-9]{1,9}@[0-9a-zA-Z]{1,9}.[0-9a-zA-Z]{1,9}")
    private String email;
    private String address;
    private Position position;
    private Division division;
    private Degree degree;
    List<Contract> contractList;

    public EmployeeDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
