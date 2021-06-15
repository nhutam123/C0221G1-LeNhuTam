package model.service;

import model.bean.Service;
import model.bean.ServiceType;
import model.repository.ServiceRepo;

import java.sql.SQLException;
import java.util.List;

public class ServiceService implements iService {
    ServiceRepo repo=new ServiceRepo();

    @Override
    public List selectAll() {
        return repo.selectAll();
    }

    @Override
    public void insertService(Service service) throws SQLException {
        repo.insertService(service);

    }

    @Override
    public Service selectService(int id) {
        return repo.selectService(id);
    }

    @Override
    public void update(Service service) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Service> search(String name) {
        return null;
    }

    @Override
    public ServiceType selectType(int id) {
        return null;
    }
}
