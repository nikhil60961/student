package com.springbootexample.student.controller;

import com.springbootexample.student.enitity.Student;
import com.springbootexample.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class StudentResource {
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudentDetails(@RequestBody Student student){
        return studentService.saveStudentDetails(student);
    }
    @GetMapping("/AllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteById(@PathVariable int id){
        return studentService.deleteById(id);
    }

    @PutMapping("/updateStudent")
    public Student updateStudentDetails(@RequestBody Student student){
        return studentService.updateStudentDetails(student);
    }

    @GetMapping("/activeStudents/{isActive}")
    public List<Student> getActiveStudents(@PathVariable boolean isActive){
        return studentService.getActiveStudents();
    }
}
