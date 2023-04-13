package com.example.Aproject;

import com.example.Aproject.Repository.DemandeRepository;
import com.example.Aproject.service.DemandeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprojectApplication.class, args);
	}


}
