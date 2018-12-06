package com.example.university.UniversityOneToManyTestProject.controller;

import com.example.university.UniversityOneToManyTestProject.exception.ResourceNotFoundException;
import com.example.university.UniversityOneToManyTestProject.model.StudentModel;
import com.example.university.UniversityOneToManyTestProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StudentController {

//    TO DO application perform CRUD operations
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @GetMapping("/students")
//    public Page<StudentModel> getAllStudents(Pageable pageable) {
//        return studentRepository.findAll(pageable);
//    }

//    @PostMapping("/students")
//    public StudentModel addStudent(@Valid @RequestBody StudentModel student) {
//        return studentRepository.save(student);
//    }
//
//    @PutMapping("/students/{studentId}")
//    public StudentModel updateSrudent(@PathVariable Long studentId, @Valid @RequestBody StudentModel studentRequest) {
//        return studentRepository.findById(studentId).map(student -> {
//            student.setFirstName(studentRequest.getFirstName());
//            student.setLastName(studentRequest.getLastName());
//            student.setCourse(studentRequest.getCourse());
//            return studentRepository.save(student);
//        }).orElseThrow(() -> new ResourceNotFoundException("StudentId" + studentId + " not found"));
//    }
//
//    @DeleteMapping("/students/{studentId}")
//    public ResponseEntity<?> deleteStudent(@PathVariable Long studentId) {
//        return studentRepository.findById(studentId).map(student -> {
//            studentRepository.delete(student);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(() -> new ResourceNotFoundException("StudentId" + studentId + " not found"));
//    }
}
