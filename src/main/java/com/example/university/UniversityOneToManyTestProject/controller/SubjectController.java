package com.example.university.UniversityOneToManyTestProject.controller;

import com.example.university.UniversityOneToManyTestProject.model.SubjectModel;
import com.example.university.UniversityOneToManyTestProject.repository.StudentRepository;
import com.example.university.UniversityOneToManyTestProject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SubjectController {

    //    TO DO application perform CRUD operations
//    @Autowired
//    private SubjectRepository subjectRepository;
//
//    @Autowired
//    private StudentRepository studentRepository;

//    @GetMapping("/students/{studentId}/subjects")
//    public Page<SubjectModel> getAllSubjectsByStudentId(@PathVariable (value = "studentId") Long studentId, Pageable pageable) {
//        return subjectRepository.findByStudentId(studentId, pageable);
//    }
//
//    @PostMapping("/students/{studentId}/subjects/{subjectId}")
//    public SubjectModel createSubject(@PathVariable (value = "studentId") Long studentId,
//                                      @Valid @RequestBody SubjectModel subject) {
//        return studentRepository.findById(studentId).map(student -> {
//            subject.setSubjectTitle();
//        })
//    }
}
