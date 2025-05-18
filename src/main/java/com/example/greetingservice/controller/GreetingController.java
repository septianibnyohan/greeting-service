package com.example.greetingservice.controller;

import com.example.greetingservice.dto.GreetingDTO;
import com.example.greetingservice.model.Greeting;
import com.example.greetingservice.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    
    @GetMapping("/api/hello")
    public String sayHello(){
        return greetingService.getGreeting();
    }

    @GetMapping("/api/greetings")
    public List<GreetingDTO> getAllGreetings() {
        return greetingService.findAll();
    }
}
