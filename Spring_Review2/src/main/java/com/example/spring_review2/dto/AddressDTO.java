package com.example.spring_review2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class AddressDTO {
    private int id;
    private String  street;
    private String city;
    private List<UserAddressDTO> userAddresses; //giong vs khai bao lien ket trong address.java


    @NoArgsConstructor
    @Getter
    @Setter
    @AllArgsConstructor
    public static class UserAddressDTO {
        @JsonProperty("username")
        private String userUsername;
        private String registeredAt;

    }
}
