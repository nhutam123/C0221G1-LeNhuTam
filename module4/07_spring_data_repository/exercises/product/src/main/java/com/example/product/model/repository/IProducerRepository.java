package com.example.product.model.repository;

import com.example.product.model.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProducerRepository extends JpaRepository<Producer,Integer> {
}
