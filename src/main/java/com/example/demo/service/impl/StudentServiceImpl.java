
package com.example.demo.service.implement;
import
import org. springframework.beans. factory. annotation. Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org. springframework.stereotype.Service;

@Service
public class ServiceImplement implements StudentService {

    @Autowired
    StudentRepository repo;

    @Override
    public Student createDAta(Student stu) {
        return repo.save(stu);
    }

    @Override
    public List<Student> fetchDAta(){
        return repo.findAll();
    }

}