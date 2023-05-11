package com.example.Second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		Sysout.out.println("hello");
		SpringApplication.run(SecondApplication.class, args);
	}

}
