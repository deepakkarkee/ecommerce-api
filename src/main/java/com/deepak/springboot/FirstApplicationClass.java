package com.deepak.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplicationClass {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstApplicationClass.class, args);
	}
 
}




