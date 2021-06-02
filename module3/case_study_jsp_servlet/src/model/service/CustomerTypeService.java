package model.service;

import model.bean.CustomerType;
import model.repository.CustomerTypeRepo;

import java.util.List;

public class CustomerTypeService implements iCustomerSevice {
    CustomerTypeRepo customerTypeRepo=new CustomerTypeRepo();
    @Override
    public List<CustomerType> selectAll() {
        return customerTypeRepo.selectAll();
    }
}
