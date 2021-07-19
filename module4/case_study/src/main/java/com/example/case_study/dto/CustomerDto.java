package com.example.case_study.dto;

import com.example.case_study.model.entity.CustomerType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.aspectj.apache.bcel.ExceptionConstants;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;


public class CustomerDto {
    private Integer id;
    private String name;
//    @Pattern(regexp = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$")
    @JsonFormat( pattern = "MM/dd/yyyy")
    private Date birthday;
    private String gender;
    private String card;
    @Pattern(regexp = "090[0-9]{7}")
    private String phoneNumber;
    @Pattern(regexp = "^[a-zA-Z0-9]{1,9}@[0-9a-zA-Z]{1,9}")
    private String email;
    private String address;
    private int flag;
    @Pattern(regexp="^KH-[0-9]{4}")
    private String customerCode;
    private CustomerType customerType;

    public CustomerDto() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
