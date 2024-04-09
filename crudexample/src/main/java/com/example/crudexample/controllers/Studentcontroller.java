package com.example.crudexample.controllers;

import com.example.crudexample.entites.Student;
import com.example.crudexample.services.implementation.Studentimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Studentcontroller
{

    @Autowired
    Studentimple imp;



    @PostMapping("/insertdata")
    public Student registerstud(@RequestBody Student stud)
    {
       return imp.createstud(stud);
    }



    @GetMapping("/getid/{id}")
    public  Student getdid(@PathVariable Integer id)
    {
        return imp.getStudentById(id);
    }


    @GetMapping("/alldata")
    public List<Student> getalldata()
    {
        return imp.getAllStudets();
    }

    @PutMapping("/updatestud")
    public Student updatestud(@RequestBody Student s)
    {
        return imp.updateStud(s);
    }

    @DeleteMapping("/deletestud/{id}")
    public boolean delteStud(@PathVariable Integer id)
    {
        return imp.deleteStudentById(id);
    }

    @PostMapping("/login")
    public Student studlogin(@RequestBody Student s)
    {
        return imp.getStudentByEmailAndPassword(s.getEmail(),s.getPassword());
    }

}
