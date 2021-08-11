package com.example.drug_store_spring.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String customerType;
    private String sign;
    private String note;

    @OneToMany(mappedBy = "prescription")
    @JsonBackReference
    private List<DrugOfBill> drugOfBillList;

    public Prescription() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<DrugOfBill> getDrugOfBillList() {
        return drugOfBillList;
    }

    public void setDrugOfBillList(List<DrugOfBill> drugOfBillList) {
        this.drugOfBillList = drugOfBillList;
    }
}
