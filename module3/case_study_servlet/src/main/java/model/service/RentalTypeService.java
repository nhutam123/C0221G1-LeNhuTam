package model.service;

import model.bean.RentalType;
import model.repository.RentalTypeRepo;

import java.util.List;

public class RentalTypeService implements iRentalTypeService {
    RentalTypeRepo rentalTypeRepo=new RentalTypeRepo();
    @Override
    public List selectAll() {
        return rentalTypeRepo.selectAll();
    }

    @Override
    public RentalType selectRentalType(int id) {
        return rentalTypeRepo.selectRentalType(id);
    }
}
