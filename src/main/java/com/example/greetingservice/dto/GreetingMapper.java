package com.example.greetingservice.dto;

import com.example.greetingservice.model.Greeting;

public class GreetingMapper {
    public static GreetingDTO toDTO(Greeting greeting) {
        return new GreetingDTO(greeting.getId(), greeting.getMessage());
    }

    public static Greeting toEntity(GreetingDTO dto) {
        Greeting greeting = new Greeting();
        greeting.setMessage(dto.getMessage());
        return greeting;
    }
}
