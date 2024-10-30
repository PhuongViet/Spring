package com.example.spring_review.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Department")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentID",unique = true)
    private int departmentID;

    @Column(name = "departmentName",unique = true)
    private String departmentName;


}
