package com.deepak.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.springboot.model.Employee;
import com.deepak.springboot.repositories.TestRepositories;

@Service
public class TestService {
	@Autowired
	private TestRepositories testRepositories;

	public List<Employee> getAll() {

		return testRepositories.findAll();
	}

}
