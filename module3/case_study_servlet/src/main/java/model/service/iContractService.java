package model.service;

import model.bean.Contract;
import model.bean.Service;

import java.util.List;

public interface iContractService<E> {
    public List<E> selectAll();
    public void insertContract(Contract contract);

}
