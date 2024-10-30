package com.example.spring_review2.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    public ModelMapper init(){
        return new ModelMapper();
    }
}
