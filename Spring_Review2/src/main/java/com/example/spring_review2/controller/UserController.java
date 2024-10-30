package com.example.spring_review2.controller;

import com.example.spring_review2.dto.UserDTO;
import com.example.spring_review2.entity.User;
import com.example.spring_review2.service.IUserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<UserDTO> getAllUser() {
        List<User> users = userService.getAllUser();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>(){}.getType());
    }


}
