package com.in28minutes.springboot.rest.example.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class StudentModel {
    @JsonProperty("id")
    private Long id = null;
    @JsonProperty("name")
    private String name = null;

    public StudentModel() {
    }

    public StudentModel id(Long id) {
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

}
