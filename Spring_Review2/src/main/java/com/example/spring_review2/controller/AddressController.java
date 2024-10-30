package com.example.spring_review2.controller;

import com.example.spring_review2.dto.AddressDTO;
import com.example.spring_review2.dto.UserDTO;
import com.example.spring_review2.entity.Address;
import com.example.spring_review2.service.IAddressService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Address")
public class AddressController {

    @Autowired
    private IAddressService addressService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<AddressDTO> getAllAddress(){
        List<Address> addresses = addressService.getAllAddress();
        return modelMapper.map(addresses, new TypeToken<List<AddressDTO>>(){}.getType());
    }
}
