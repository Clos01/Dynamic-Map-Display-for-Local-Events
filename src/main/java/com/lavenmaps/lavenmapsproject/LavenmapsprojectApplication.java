package com.lavenmaps.lavenmapsproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class LavenmapsprojectApplication {

    // This field will hold the value of 'api.key' from your application.properties file
    @Value("${api.key}")
    private String apiKey;

    public static void main(String[] args) {
        SpringApplication.run(LavenmapsprojectApplication.class, args);
    }

    // Define a bean for RestTemplate which is used to make HTTP requests
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
