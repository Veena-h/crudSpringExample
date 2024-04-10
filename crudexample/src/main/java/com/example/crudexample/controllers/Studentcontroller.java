package com.example.crudexample.controllers;

import com.example.crudexample.entites.Student;
import com.example.crudexample.services.implementation.Studentimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @PostMapping("/insertstatus")
    public ResponseEntity<Student> create(@RequestBody Student s)
    {
            Student ss=imp.createstud(s);
            return ResponseEntity.status(HttpStatus.CREATED).body(ss);
    }


    @GetMapping("/getstatus/{id}")
    public ResponseEntity<Student> getids(@PathVariable Integer id)
    {
           Student ss=imp.getStudentById(id);
           return  ResponseEntity.status(HttpStatus.ACCEPTED).body(ss);
    }


    @GetMapping("/getstatus")
    public ResponseEntity<List<Student>> getids()
    {
              List<Student> s =imp.getAllStudets();
        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(s);
    }

@PutMapping("/updatestatus")
    public ResponseEntity<Student> updatestatus(@RequestBody  Student s)
{
      Student ss=imp.updateStud(s);
    return  ResponseEntity.status(HttpStatus.ACCEPTED).body(ss);

}


@DeleteMapping("/deletestatus/{id}")
    public ResponseEntity<Boolean> deletebyid(@PathVariable Integer id)
{
    Boolean b=imp.deleteStudentById(id);
    if(b)
    {

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(b);
    }else
    {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(b);

    }
}

Student s;

@PostMapping("/emailcheck1")
    public ResponseEntity<Object> checkemail(@RequestBody Student stud)
{
    String email=s.getEmail();
    Student StudEmail=imp.getStudentByEmail(email);

    if(StudEmail ==null)
    {
         Student emailcheck=imp.createstud(stud);
        return  ResponseEntity.status(HttpStatus.CREATED).body(emailcheck);
    }else {
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid creditials");
    }
}




}
