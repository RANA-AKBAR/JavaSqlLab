package com.codeclan.manyToManyLab.manyToManyLab;

import com.codeclan.manyToManyLab.manyToManyLab.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;



	@Test
	public void contextLoads() {
	}


	@Test
	public void createEmployee(){
		
	}

}
