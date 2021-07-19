package com.example.case_study.model.service;

import com.example.case_study.model.entity.Contract;
import com.example.case_study.model.repository.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractService implements IContractService{
    @Autowired
    IContractRepository iContractRepository;
    @Override
    public Page<Contract> findAll(Pageable pageable, String name) {
        return iContractRepository.findAllByNameContaining(pageable,"%"+name+"%");
    }

    @Override
    public Page<Contract> findAll(Pageable pageable, String name, String email) {
        return null;
    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);

    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return Optional.empty();
    }
}
