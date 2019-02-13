package com.in28minutes.springboot.rest.example.student;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teacher")
public class TeacherEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long teacher_id;
    private String name;
    private Long salary;
    @OneToMany(mappedBy="teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentEntity> students;

    public TeacherEntity() {
        super();
    }


    public List<StudentEntity> getStudents() {
        return this.students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public void addStudent(StudentEntity studentEntity) {
        if (students == null) {
            students = new ArrayList<StudentEntity>();
        }
        students.add(studentEntity);
        studentEntity.setTeacher(this);

    }

    public TeacherEntity(Long id, String name, Long salary) {
        super();
        this.teacher_id = teacher_id;
        this.name = name;
        this.salary = salary;
    }
    public Long getId() {
        return teacher_id;
    }
    public void setId(Long id) {
        this.teacher_id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
