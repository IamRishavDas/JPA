package com.example.StudentDemoProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDemoProject.model.Student;
import com.example.StudentDemoProject.repository.StudentRepository;

import java.util.List;



@RestController   
public class StudentController {

    @Autowired
    StudentRepository repo;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @GetMapping("/students/{name}")
    public List<Student> getStudentByName(@PathVariable String name){
        return repo.findByName(name);
    }
    
}
