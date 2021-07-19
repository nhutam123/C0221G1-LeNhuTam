package com.example.case_study.model.repository;

import com.example.case_study.model.entity.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAttachRepository extends JpaRepository<AttachService,Integer> {
}
