package com.codeclan.manyToManyLab.manyToManyLab.repositories;

import com.codeclan.manyToManyLab.manyToManyLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
