package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This is to specify this is a spring boot application
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/**
		 * What does this line do?
		 * 1. Setup default configuration
		 * 2. Start Spring Application context
		 * 3. Perform path scan
		 * 4. Start Tomcat server
		 */
		SpringApplication.run(DemoApplication.class, args);
	}
}
