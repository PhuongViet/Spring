package com.example.spring_review.service;

import com.example.spring_review.entity.Department;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDepartmentService {
    Page<Department> GetAllDepartment(Pageable pageable);


    void AddDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(int id);

    Department getDepartmentById(int id);
}
