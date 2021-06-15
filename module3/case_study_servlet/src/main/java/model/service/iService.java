package model.service;

import model.bean.Customer;
import model.bean.CustomerType;
import model.bean.Service;
import model.bean.ServiceType;

import java.sql.SQLException;
import java.util.List;

public interface iService<E> {
    public List<E> selectAll();
    public void insertService(Service service) throws SQLException;
    public Service selectService(int id);
    public void update(Service service);
    public void delete(int id);
    public List<Service> search(String name);
    public ServiceType selectType(int id);
}
