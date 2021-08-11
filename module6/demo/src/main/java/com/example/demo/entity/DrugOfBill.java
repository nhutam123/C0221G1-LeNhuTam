package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class DrugOfBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "drug_id", referencedColumnName = "id")
    private Drug drug;

    @ManyToOne
    @JoinColumn(name = "bill_id",referencedColumnName = "id")
    private Bill bill;


    @ManyToOne
    @JoinColumn(name = "prescription_id",referencedColumnName = "id")
    private Prescription prescription;

    public DrugOfBill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
