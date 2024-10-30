package com.example.spring_review2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "username", nullable = false, length = 50,unique = true)
    private String username;


    @OneToMany(mappedBy = "user") // user phải giôống như cái đã khai báo o UserAddress.java
    private List<UserAddress> userAddresses;


}
