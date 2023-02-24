package com.springbootexample.student.service;

import com.springbootexample.student.enitity.Student;
import com.springbootexample.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudentDetails(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public String deleteById(int id){
        studentRepository.deleteById(id);
        return "student removed"+id;
    }
    public Student updateStudentDetails(Student student){
        Student studentX = studentRepository.findById(student.getId()).orElse(null);
        studentX.setStudentName(student.getStudentName());
        studentX.setAge(student.getAge());
        studentX.setIsActive(student.getIsActive());
        return studentRepository.save(studentX);
    }

    public List<Student> getActiveStudents(){
        return studentRepository.findByIsActiveIsTrue();
    }
}
