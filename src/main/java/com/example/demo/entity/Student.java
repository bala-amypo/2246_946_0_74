package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class Student{
    @Id
    private Long id;
    private String stuname;
    private String email;
    private float cgpa;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){                                             
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(Strind email){
        this.email=email;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(){
        this.cgpa=cgpa;
    }
    public Student(Long id,String name,String email,float cgpa){
        this.id=id;
        Student_Name=student_Name;
        Student_Email=student_Email;
        this.cgpa=cgpa;
    }    
}