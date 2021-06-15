package model.service;

import model.bean.Customer;
import model.bean.CustomerType;
import model.repository.CustomerRepository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerService implements iCustomerSevice {
    CustomerRepository service=new CustomerRepository();
    private static final String ID_REGEX="KH-[0-9]{4}";

    @Override
    public List<Customer> selectAll() {
        return service.selectAll();
    }

    @Override
    public Map<String,String> insertCustomer(Customer customer) throws SQLException {
        Map<String,String> map=new HashMap<>();
        boolean check=true;
        if ("".equals(customer.getEmail())){
            check=false;
            map.put("email","please input email");
        }else if (!customer.getEmail().matches(("^[a-z]\\S+@\\S+\\.\\S+$"))){
            map.put("email","invalit format value Hint:abc@gmail.com");
            check=false;
        }
        if (check){
            service.insertCustomer(customer);
        }
        return map;
    }

    @Override
    public Customer selectCustomer(int id) {
        return service.selectCustomer(id);
    }

    @Override
    public void update(Customer customer) {
        service.update(customer);
    }

    @Override
    public void delete(int id) {
        service.delete(id);
    }

    @Override
    public List<Customer> search(String name) {
        return service.search(name);
    }

    @Override
    public CustomerType selectType(int id) {
        return null;
    }
    public  boolean validateIdCustomer(String idCustomer){
        Pattern pattern=Pattern.compile(ID_REGEX);
        Matcher matcher=pattern.matcher(idCustomer);
        return matcher.matches();
    }


}
