package com.in28minutes.springboot.rest.example.student;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    TeacherModel saveStudent(TeacherModel teacherModel);

}
