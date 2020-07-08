package com.deepak.springboot.repositories;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.deepak.springboot.model.Employee;

@Repository
public class TestRepositories {
	@Autowired
	JdbcTemplate jdbcTemplate;

	private RowMapper<Employee> rowMapper = (ResultSet rs, int rowNumber) -> {
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setFirstName(rs.getString("first_name"));
		emp.setLastName(rs.getString("last_name"));
		emp.setEmail(rs.getString("email"));
		return emp;

	};

	public List<Employee> findAll() {
		List<Employee> employees = jdbcTemplate.query("select * from TBL_EMPLOYEES", rowMapper);
		
		//printing to console
		employees.forEach(employee ->{
			System.out.println(employee.getFirstName() + " " + employee.getLastName());
		});
		
		
		return employees;
	}

}
