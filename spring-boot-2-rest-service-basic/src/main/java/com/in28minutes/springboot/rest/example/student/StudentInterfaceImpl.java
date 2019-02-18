package com.in28minutes.springboot.rest.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class StudentInterfaceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public TeacherModel saveStudent(TeacherModel teacherModel) {

        // save it to db

        // 1. convert model to entities
        TeacherEntity teacherEntity = ModelToTeacherEntity(teacherModel);
        List<StudentEntity> studentEntities = ModelToStudentEntities(teacherModel);
        for(StudentEntity entity : studentEntities) {
            teacherEntity.addStudent(entity);
        }

        //teacherEntity.setStudents(studentEntities);

        // 2. save entities to repository
        TeacherEntity createdTeacherEntity = teacherRepository.save(teacherEntity);
        //teacherRepository.getOne()

        // 3. convert entities to model
        TeacherModel  teacherModelReturnResult = TeacherEntityToModel(createdTeacherEntity);


        // 4. return the model
        return teacherModelReturnResult;
    }


    @Override
    public TeacherArray findTeachers() {


        TeacherArray teachersArray = new TeacherArray();
        List<TeacherEntity> teacherEntities = teacherRepository.findAll();
//        List<TeacherModel> teachers = new ArrayList<>();
        for (TeacherEntity entity: teacherEntities)
        {
            TeacherModel teachersModel = new TeacherModel();
            teachersModel = TeacherEntityToModel(entity);
            teachersArray.add(teachersModel);
        }
        
        return teachersArray;
    }

    public TeacherEntity ModelToTeacherEntity(TeacherModel teacherModel) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setId(teacherModel.getId());
        teacherEntity.setSalary(teacherModel.getSalary());
        teacherEntity.setName(teacherModel.getName());

        return teacherEntity;
    }

    public List<StudentEntity> ModelToStudentEntities(TeacherModel teacherModel) {
        List<StudentEntity> studentEntities = new ArrayList<>();
        List<StudentModel> students = teacherModel.getStudents();
            for (StudentModel student : students) {
                StudentEntity studentEntity = StudentModelToEntity(student);
                studentEntities.add(studentEntity);
            }
        return studentEntities;
    }

    public StudentEntity StudentModelToEntity(StudentModel student){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(student.getId());
        studentEntity.setName(student.getName());
        return studentEntity;
    }

    public TeacherModel TeacherEntityToModel(TeacherEntity teacherEntity){
        TeacherModel teacherModel = new TeacherModel();
        teacherModel.setId(teacherEntity.getId());
        teacherModel.setName(teacherEntity.getName());
        teacherModel.setSalary(teacherEntity.getSalary());
        List<StudentModel> students = new ArrayList<>();
        for (StudentEntity entity : teacherEntity.getStudents()) {
            StudentModel studentModel = new StudentModel();
            studentModel.setId(entity.getId());
            studentModel.setName(entity.getName());
            students.add(studentModel);
        }
        teacherModel.setStudents(students);
        return teacherModel;
    }

}
