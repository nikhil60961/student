package com.springbootexample.student.enitity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
@Data
@Entity
@Table(name="students")
public class Student {

//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "uuid2")
//    @Column(name = "id", columnDefinition = "BINARY(16)")
//    @Id
//    private UUID id;
    @Column(name = "id", columnDefinition = "BINARY(16)")
    @Id
    private int id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "age")
    private int age;

    @Column(name = "is_active")
    private Boolean isActive;


}
