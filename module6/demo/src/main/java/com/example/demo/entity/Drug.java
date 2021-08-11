package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int price;

    @OneToMany(mappedBy = "drug")
    @JsonBackReference
    private List<DrugOfBill> drugOfBillList;

    public Drug() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<DrugOfBill> getDrugOfBillList() {
        return drugOfBillList;
    }

    public void setDrugOfBillList(List<DrugOfBill> drugOfBillList) {
        this.drugOfBillList = drugOfBillList;
    }
}
