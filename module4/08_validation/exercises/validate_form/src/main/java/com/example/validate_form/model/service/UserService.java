package com.example.validate_form.model.service;

import com.example.validate_form.model.entity.User;
import com.example.validate_form.model.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }
}
