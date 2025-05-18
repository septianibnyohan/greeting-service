package com.example.greetingservice.service;

import com.example.greetingservice.model.Greeting;
import com.example.greetingservice.repository.GreetingRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GreetingServiceImplTest {

    @Test
    void shouldSaveGreetingToDatabase() {
        GreetingRepository mockRepo = Mockito.mock(GreetingRepository.class);
        GreetingServiceImpl service = new GreetingServiceImpl(mockRepo);

        service.getGreeting();

        Mockito.verify(mockRepo).save(Mockito.any(Greeting.class));
    }
}
