package com.in28minutes.springboot.rest.example.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class TeacherModel {
    @JsonProperty("id")
    private Long id = null;
    @JsonProperty("name")
    private String name = null;
    @JsonProperty("salary")
    private Long salary = null;
    @JsonProperty("students")
    private List<StudentModel> students = null;



    public TeacherModel() {
    }

    public TeacherModel id(Long id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty("")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ApiModelProperty("")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @ApiModelProperty("")
    public Long getSalary() {
        return this.salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @ApiModelProperty("")
    public List<StudentModel> getStudents() {
        return this.students;
    }

    public void setStudents(List<StudentModel> students) {
        this.students = students;
    }


}
