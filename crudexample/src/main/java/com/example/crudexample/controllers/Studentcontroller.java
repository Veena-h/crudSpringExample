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



    @PostMapping("/getdate")
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

}
