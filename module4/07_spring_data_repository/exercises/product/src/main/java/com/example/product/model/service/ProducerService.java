package com.example.product.model.service;

import com.example.product.model.entity.Producer;
import com.example.product.model.repository.IProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService implements IProducerService {
    @Autowired
    IProducerRepository iProducerRepository;

    @Override
    public List<Producer> findAll() {
        return iProducerRepository.findAll();
    }
}
