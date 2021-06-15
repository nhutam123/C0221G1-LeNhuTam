package model.service;

import model.bean.Contract;
import model.repository.ContractRepo;

import java.util.List;

public class ContractService implements iContractService {
    ContractRepo contractRepo=new ContractRepo();
    @Override
    public List<Contract> selectAll() {
        return contractRepo.selectAll();
    }

    @Override
    public void insertContract(Contract contract) {
        contractRepo.insertContract(contract);

    }
}
