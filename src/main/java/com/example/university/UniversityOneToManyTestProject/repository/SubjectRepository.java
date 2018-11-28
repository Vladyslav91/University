package com.example.university.UniversityOneToManyTestProject.repository;

import com.example.university.UniversityOneToManyTestProject.model.SubjectModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectModel, Long> {
    Page<SubjectModel> findByStudentId(Long studentId, Pageable pageable);
}
