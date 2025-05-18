package com.example.greetingservice.service;

import com.example.greetingservice.dto.GreetingDTO;
import com.example.greetingservice.dto.GreetingMapper;
import com.example.greetingservice.model.Greeting;
import com.example.greetingservice.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {
    private final GreetingRepository repository;

    public GreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getGreeting() {
        Greeting g = new Greeting("Hello from DB!");
        repository.save(g);
        return g.getMessage();
    }

    @Override
    public List<GreetingDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(GreetingMapper::toDTO)
                .toList();
    }
}
