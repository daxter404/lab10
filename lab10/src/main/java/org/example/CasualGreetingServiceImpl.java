package org.example;

import org.springframework.stereotype.Service;

@Service("casualGreeting")
public class CasualGreetingServiceImpl implements GreetingService {
    public String getGreeting() {
        return "Hey there, Spring Boot!";
    }
}