package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billRetailId;


    private String employee;

    @OneToMany(mappedBy = "bill")
    @JsonBackReference
    private List<DrugOfBill> drugOfBillList;

    public Bill() {
    }


}
