package com.example.university.UniversityOneToManyTestProject.repository;

import com.example.university.UniversityOneToManyTestProject.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}
