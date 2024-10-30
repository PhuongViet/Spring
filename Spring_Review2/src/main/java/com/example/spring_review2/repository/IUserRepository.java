package com.example.spring_review2.repository;

import com.example.spring_review2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
