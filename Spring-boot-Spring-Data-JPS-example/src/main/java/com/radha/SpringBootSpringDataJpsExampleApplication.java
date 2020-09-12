package com.radha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.radha")
@SpringBootApplication
public class SpringBootSpringDataJpsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringDataJpsExampleApplication.class, args);
	}

}
