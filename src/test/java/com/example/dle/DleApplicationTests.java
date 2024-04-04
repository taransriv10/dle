package com.example.dle;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DleApplicationTests {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testDoubleNumberEndpoint() {
        // Given
        int inputNumber = 7;

        // When
        int result = restTemplate.getForObject("http://localhost:" + port + "/double?number=" + inputNumber, Integer.class);

        // Then
        assertEquals(14,result);
    }

}
