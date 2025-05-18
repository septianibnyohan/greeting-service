package com.example.greetingservice.service;

import com.example.greetingservice.dto.GreetingDTO;

import java.util.List;

public interface GreetingService {
    String getGreeting();

    List<GreetingDTO> findAll();
}
