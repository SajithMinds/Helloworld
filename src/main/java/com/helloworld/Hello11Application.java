package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Hello11Application {

	@GetMapping("/msg")
	public String msg() {
		return "Hello spring boot project";
	}
	public static void main(String[] args) {
		SpringApplication.run(Hello11Application.class, args);
	}

}
