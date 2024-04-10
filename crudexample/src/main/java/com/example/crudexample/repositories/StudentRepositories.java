package com.example.crudexample.repositories;

import com.example.crudexample.entites.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepositories extends JpaRepository<Student,Integer>
{

    public Student getStudentById(Integer Id);

    @Query(nativeQuery = true,value = "select * from student")
    public List<Student> getAllStudents();

    @Transactional
    public  Integer deleteStudentById(Integer Id);

    public Student getStudentByEmailAndPassword(String Email,String Password);

    public Student getStudentByEmail(String Email);

}
