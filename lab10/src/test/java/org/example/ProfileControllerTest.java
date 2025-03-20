package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("dev") // Set the active profile to dev for testing
public class ProfileControllerTest {

    @Value("${app.message}")
    private String message;

    @Test
    public void testDevProfile() {
        assertEquals("Welcome to the Development Environment!", message);
    }
}
