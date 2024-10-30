package com.example.spring_review2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String username;
    private String AddressStreet;
    private String AddressCity;
}
