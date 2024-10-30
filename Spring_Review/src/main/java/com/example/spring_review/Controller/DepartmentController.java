package com.example.spring_review.Controller;

import com.example.spring_review.entity.Department;
import com.example.spring_review.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Department")
public class DepartmentController {



    @Autowired
    private IDepartmentService departmentService;

    @GetMapping
    public Page<Department> getAll(Pageable pageable) {
        return departmentService.GetAllDepartment(pageable);
    }

    @PostMapping
    public ResponseEntity<String> uddDepartment(@RequestBody Department department){

        departmentService.AddDepartment(department);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateDepartment(@PathVariable int id,@RequestBody Department department){

        department.setDepartmentID(id);
        System.out.println(id);
        departmentService.updateDepartment(department);
        return new ResponseEntity<>("Updated", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable int id){
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return departmentService.getDepartmentById(id);
    }
}
