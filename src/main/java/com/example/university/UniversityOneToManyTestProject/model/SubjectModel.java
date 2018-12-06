package com.example.university.UniversityOneToManyTestProject.model;

import com.example.university.UniversityOneToManyTestProject.enums.Subjects;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "subjects")
public class SubjectModel extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @NaturalId
    private String subjectTitle;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "subjects")
    private Set<StudentModel> students = new HashSet<>();

    public SubjectModel() {

    }

    public SubjectModel(Subjects subjectTitle) {
        this.subjectTitle = subjectTitle.toString();
    }
}
