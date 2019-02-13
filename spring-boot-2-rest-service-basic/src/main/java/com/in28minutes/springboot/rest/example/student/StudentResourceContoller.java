package com.in28minutes.springboot.rest.example.student;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@Api
public class StudentResourceContoller {

	@Autowired
	private StudentService studentService;


//	@GetMapping("/students")
//	public List<StudentEntity> retrieveAllStudents() {
//		return studentRepository.findAll();
//	}
//
//	@GetMapping("/students/{id}")
//	public StudentEntity retrieveStudent(@PathVariable long id) {
//		Optional<StudentEntity> student = studentRepository.findById(id);
//
//		if (!student.isPresent())
//			throw new StudentNotFoundException("id-" + id);
//
//		return student.get();
//	}
//
//	@RequestMapping("/delstudents/{id}")
//	public void deleteStudent(@PathVariable long id) {
//
//		studentRepository.deleteById(id);
//	}
//
//	@PostMapping("/students")
//	public ResponseEntity<Object> createStudent(@RequestBody StudentEntity student) {
//		StudentEntity savedStudent = studentRepository.save(student);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(savedStudent.getId()).toUri();
//
//		return ResponseEntity.created(location).build();
//
//	}
//
//
//	@PutMapping("/students/{id}")
//	public ResponseEntity<Object> updateStudent(@RequestBody StudentEntity student, @PathVariable long id) {
//
//		Optional<StudentEntity> studentOptional = studentRepository.findById(id);
//
//		if (!studentOptional.isPresent())
//			//return ResponseEntity.notFound().build();
//            return ResponseEntity.notFound().build();
//
//		student.setId(id);
//
//		studentRepository.save(student);
//
//		return ResponseEntity.noContent().build();
//	}
//
//
//
//
//    @GetMapping("/number/{id}")
//    public int getNumber(@PathVariable int id) {
//	    return id;
//    }

    @PostMapping("/teacherStudents")
	public ResponseEntity<Object> teacherStudents(@RequestBody TeacherModel teacherModel) {

        TeacherModel teacherModelCreated = studentService.saveStudent(teacherModel);
        return new ResponseEntity<>(teacherModelCreated, HttpStatus.CREATED);
	}
}
