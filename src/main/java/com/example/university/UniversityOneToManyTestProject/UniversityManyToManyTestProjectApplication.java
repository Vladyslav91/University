package com.example.university.UniversityOneToManyTestProject;

import com.example.university.UniversityOneToManyTestProject.enums.Subjects;
import com.example.university.UniversityOneToManyTestProject.model.StudentModel;
import com.example.university.UniversityOneToManyTestProject.model.SubjectModel;
import com.example.university.UniversityOneToManyTestProject.repository.StudentRepository;
import com.example.university.UniversityOneToManyTestProject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // enable auto
public class UniversityManyToManyTestProjectApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private SubjectRepository subjectRepository;

	public static void main(String[] args) {
		SpringApplication.run(UniversityManyToManyTestProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentRepository.deleteAllInBatch();
		subjectRepository.deleteAllInBatch();

		StudentModel studentA = new StudentModel("Test1", "User1");

		SubjectModel subjectFirst = new SubjectModel(Subjects.ALGEBRA);
		SubjectModel subjectSecond = new SubjectModel(Subjects.ARCHAEOLOGY);
		SubjectModel subjectThird = new SubjectModel(Subjects.ART);

		studentA.getSubjects().add(subjectFirst);
		studentA.getSubjects().add(subjectSecond);
		studentA.getSubjects().add(subjectThird);

		subjectFirst.getStudents().add(studentA);
		subjectSecond.getStudents().add(studentA);
		subjectThird.getStudents().add(studentA);

		studentRepository.save(studentA);

	}
}
