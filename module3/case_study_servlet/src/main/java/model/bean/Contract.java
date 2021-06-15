package model.bean;

import java.util.Date;

public class Contract {
    private int id;
    private String startTime;
    private String endTime;
    private double deposit;
    private double total;
    private  Employee employee;
    private Customer customer;
    private Service service;


    public Contract() {
    }

    public Contract(int id, String startTime, String endTime, double deposit, double total, Employee employee, Customer customer, Service service) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.deposit = deposit;
        this.total = total;
        this.employee = employee;
        this.customer = customer;
        this.service = service;

    }

    public Contract(String startTime, String endTime, double deposit, double total, Employee employee, Customer customer, Service service) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.deposit = deposit;
        this.total = total;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }


}
