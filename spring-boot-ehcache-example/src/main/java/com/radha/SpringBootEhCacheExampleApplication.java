package com.radha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootEhCacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEhCacheExampleApplication.class, args);
	}

}
