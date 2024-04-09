package com.example.crudexample.services.implementation;

import com.example.crudexample.entites.Student;
import com.example.crudexample.services.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentimple implements Studentservice 
{

    @Autowired
    public  com.example.crudexample.repositories.StudentRepositories repositories;


    @Override
    public Student createstud(Student s) {
        return repositories.save(s);
    }

    @Override
    public Student getStudentById(Integer Id) {
        return repositories.getStudentById(Id);
    }

    @Override
    public List<Student> getAllStudets() {
        return repositories.getAllStudents();
    }

    @Override
    public Student updateStud(Student s) {
        return repositories.save(s);
    }
}
