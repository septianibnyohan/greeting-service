package com.example.greetingservice.repository;

import com.example.greetingservice.model.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class GreetingRepositoryTest {

    @Autowired
    private GreetingRepository repository;

    @Test
    void shouldSaveAndFindGreeting() {
        Greeting greeting = new Greeting("Hello Test!");
        repository.save(greeting);

        List<Greeting> all = repository.findAll();
        assertThat(all).extracting(Greeting::getMessage).contains("Hello Test!");
    }
}
