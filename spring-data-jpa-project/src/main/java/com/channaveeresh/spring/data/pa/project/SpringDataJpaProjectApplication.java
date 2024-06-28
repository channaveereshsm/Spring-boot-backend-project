package com.channaveeresh.spring.data.pa.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		System.out.println("hi");

	}
	@GetMapping("/")
	public static String hello()
	{
		return "welcome veerendra";
	}

}
