package com.example.spring_review2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class UserAddress{
    @EmbeddedId
    private UserAddressPK id;


    //thiet lap lienket vs bang User
    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId") //giong nhu cai da khai bao trong UserAddressPK.java
    private User user;

    //thiet lap lienket vs bang Address
    @ManyToOne
    @JoinColumn(name = "address_id")
    @MapsId("addressId") //giong nhu cai da khai bao trong UserAddressPK.java
    private Address address;


    @Column(name = "registered_at")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date registeredAt;
}
