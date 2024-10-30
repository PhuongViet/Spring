package com.example.spring_review.repository;

import com.example.spring_review.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDepartmentRepository extends JpaRepository<Department, Integer>{
}
