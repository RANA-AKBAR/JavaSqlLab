package com.codeclan.manyToManyLab.manyToManyLab;

import com.codeclan.manyToManyLab.manyToManyLab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyLabApplication {

	@Autowired
	EmployeeRepository employeeRepository;



	public static void main(String[] args) {
		SpringApplication.run(ManyToManyLabApplication.class, args);
	}

}
