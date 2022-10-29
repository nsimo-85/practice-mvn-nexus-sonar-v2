package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		String name = "simo";

		System.out.println(name);

		SpringApplication.run(DemoApplication.class, args);
		String DBPassword = "Admin@1234";

		System.out.println("Hello");
		System.out.println("World");
	}

}
