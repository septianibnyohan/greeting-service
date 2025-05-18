package com.example.greetingservice.model;

import jakarta.persistence.*;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    // Constructors
    public Greeting() {}
    public Greeting(String message) {
        this.message = message;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getMessage() { return message; }
    public void setId(Long id) { this.id = id; }
    public void setMessage(String message) { this.message = message; }
}
