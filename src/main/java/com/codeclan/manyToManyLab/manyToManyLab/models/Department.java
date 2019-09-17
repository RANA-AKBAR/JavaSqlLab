package com.codeclan.manyToManyLab.manyToManyLab.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;




@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue
    @Column(name ="id")
    private Long id;
    @Column(name ="name")
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "department")
    private List<Employee> employee;

    public Department(String name) {
        this.name = name;
        this.employee = new ArrayList<Employee>();
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
