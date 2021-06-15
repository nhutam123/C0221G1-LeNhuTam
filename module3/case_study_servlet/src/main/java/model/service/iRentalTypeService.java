package model.service;

import model.bean.RentalType;
import model.bean.Service;

import java.util.List;

public interface iRentalTypeService<E> {
    public List<E> selectAll();
    public RentalType selectRentalType(int id);
}
