package com.lavenmaps.lavenmapsproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




@SpringBootApplication
public class LavenmapsprojectApplication {

	@Value("${api.key}")
private String apiKey;

	public static void main(String[] args) {
		SpringApplication.run(LavenmapsprojectApplication.class, args);

	}
	@Bean
	  public RestTemplate getRestTemplate() {
		 return new RestTemplate();
	  }

}
