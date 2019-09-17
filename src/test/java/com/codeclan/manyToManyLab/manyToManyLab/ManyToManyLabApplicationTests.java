package com.codeclan.manyToManyLab.manyToManyLab;

import com.codeclan.manyToManyLab.manyToManyLab.models.Department;
import com.codeclan.manyToManyLab.manyToManyLab.models.Employee;
import com.codeclan.manyToManyLab.manyToManyLab.models.Project;
import com.codeclan.manyToManyLab.manyToManyLab.repositories.DepartmentRepository;
import com.codeclan.manyToManyLab.manyToManyLab.repositories.EmployeeRepository;
import com.codeclan.manyToManyLab.manyToManyLab.repositories.ProjectRepository;
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
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;



	@Test
	public void contextLoads() {
	}

	@Test
	public void createDepartmentAndEmployee(){

		Department department = new Department("Tech");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Roberto","Carlos",4356, department);
		employeeRepository.save(employee1);

	}

	@Test
	public void addEmployeeToProject(){
		Department department = new Department("Tech");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Roberto","Carlos",4356, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Java", 7);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);


	}



}
