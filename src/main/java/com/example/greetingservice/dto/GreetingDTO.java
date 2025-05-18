package com.example.greetingservice.dto;

public class GreetingDTO {
    private Long id;
    private String message;

    public GreetingDTO() {}
    public GreetingDTO(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
