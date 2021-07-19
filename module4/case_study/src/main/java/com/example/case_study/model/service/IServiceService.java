package com.example.case_study.model.service;

import com.example.case_study.model.entity.Service;

import java.util.List;

public interface IServiceService extends ICommonService<Service>{
 List<Service> findAll();
}
