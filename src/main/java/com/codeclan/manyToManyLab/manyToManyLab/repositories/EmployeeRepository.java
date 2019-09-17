package com.codeclan.manyToManyLab.manyToManyLab.repositories;


import com.codeclan.manyToManyLab.manyToManyLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
