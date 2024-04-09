package com.example.crudexample.services;

import com.example.crudexample.entites.Student;

import java.util.List;

public interface Studentservice
{

    public Student createstud(Student s);

    public Student getStudentById(Integer Id);

    public List<Student> getAllStudets();

    public Student updateStud(Student s);

    public boolean deleteStudentById(Integer Id);

    public  Student getStudentByEmailAndPassword(String Email,String Password);
}
