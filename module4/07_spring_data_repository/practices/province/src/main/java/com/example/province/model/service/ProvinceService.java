package com.example.province.model.service;

import com.example.province.model.entity.Province;
import com.example.province.model.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ProvinceService implements IProvinceService {

    @Autowired
    IProvinceRepository iProvinceRepository;
    @Override
    public List<Province> findAll() {
        return iProvinceRepository.findAll();
    }
}
