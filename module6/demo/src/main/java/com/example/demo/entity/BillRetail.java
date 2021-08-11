package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

public class BillRetail {
    private Long billRetailId;
    private String code;
    private Date invoiceDate;
    private String note;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "bill")
    @JsonBackReference
    private List<DrugOfBill> drugOfBillList;

    public BillRetail() {
    }

    public Long getBillRetailId() {
        return billRetailId;
    }

    public void setBillRetailId(Long billRetailId) {
        this.billRetailId = billRetailId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<DrugOfBill> getDrugOfBillList() {
        return drugOfBillList;
    }

    public void setDrugOfBillList(List<DrugOfBill> drugOfBillList) {
        this.drugOfBillList = drugOfBillList;
    }
}
