package com.example.management_phone.model.repository;

import com.example.management_phone.model.entity.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface ISmartphoneRepository extends CrudRepository<Smartphone,Long> {
}
