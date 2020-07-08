package com.deepak.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.springboot.model.Employee;
import com.deepak.springboot.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;

	@GetMapping("/health")
	public String getHealth() {
		return "I am working";
	}

	@GetMapping("/findAllEmployees")
	public List<Employee> getAll() {
		// TestService testService = new TestService () ;
		return testService.getAll();
	}
}
