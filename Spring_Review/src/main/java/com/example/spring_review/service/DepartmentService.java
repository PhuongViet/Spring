package com.example.spring_review.service;


import com.example.spring_review.entity.Department;
import com.example.spring_review.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public Page<Department> GetAllDepartment(Pageable pageable) {
        return departmentRepository.findAll(pageable);
    }

    @Override
    public void AddDepartment(Department department) {
        if (department.getDepartmentName() == null) {
            throw new IllegalArgumentException("DepartmentName không thể là null");
        }
        departmentRepository.save(department);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department getDepartmentById(int id) {
       return departmentRepository.findById(id).get();
    }


}
