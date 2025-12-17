package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService stser;
    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
       return stser.createData(stu);
    }
    @GetMapping("/fetchrecord")
    public List<Student> fetchRecord(){
      return stser.fetchRecord();
    }
}