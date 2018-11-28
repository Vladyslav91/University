package com.example.university.UniversityOneToManyTestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UniversityOneToManyTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityOneToManyTestProjectApplication.class, args);
	}
}
