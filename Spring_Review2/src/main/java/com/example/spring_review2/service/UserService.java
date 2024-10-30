package com.example.spring_review2.service;

import com.example.spring_review2.entity.User;
import com.example.spring_review2.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> getAllUser() {
       return userRepository.findAll();
    }
}
