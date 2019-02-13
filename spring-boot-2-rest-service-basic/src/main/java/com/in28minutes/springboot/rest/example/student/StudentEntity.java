package com.in28minutes.springboot.rest.example.student;

import javax.persistence.*;
//import javax.persistence.Id;

import java.io.Serializable;

@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private TeacherEntity teacher;

	public StudentEntity() {
		super();
	}

	public StudentEntity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public TeacherEntity getTeacher() {
		return this.teacher;
	}

	public void setTeacher(TeacherEntity teacher) {
		this.teacher = teacher;
	}
}
