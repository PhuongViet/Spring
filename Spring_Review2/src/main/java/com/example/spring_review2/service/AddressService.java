package com.example.spring_review2.service;

import com.example.spring_review2.entity.Address;
import com.example.spring_review2.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService{

    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }
}
