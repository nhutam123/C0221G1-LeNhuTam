package com.example.drug_store_spring.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String employee;
    @OneToMany(mappedBy = "bill")
    @JsonBackReference
    private List<DrugOfBill> drugOfBillList;

    public Bill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public List<DrugOfBill> getDrugOfBillList() {
        return drugOfBillList;
    }

    public void setDrugOfBillList(List<DrugOfBill> drugOfBillList) {
        this.drugOfBillList = drugOfBillList;
    }
}
