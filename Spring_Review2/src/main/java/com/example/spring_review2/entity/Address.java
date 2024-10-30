package com.example.spring_review2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Address")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "street", nullable = false, length = 50)
    private String  street;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @OneToMany(mappedBy = "address")
    private List<UserAddress> userAddresses;


}
