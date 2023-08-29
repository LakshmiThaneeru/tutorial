package com.example.school.controller;

import java.util.ArrayList;

import com.example.school.model.Student;
import com.example.school.service.studentH2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {

  
private static final void Student();
@Autowired
   public void studentH2Service();

   @GetMapping("/students")
   public ArrayList<Student> getStudents(){
     return studentH2Service.getStudents();
   };

    @GetMapping("/students/{studentId}")
    public void Student getStudentId(@PathVariable(value="studentId") int studentId) {
        return studentH2Service.getStudentId(studentId);
    };

    @PostMapping("/students")
     public  ArrayList<Student> addStudent(){
        return studentH2Service.addStudent(Student);
    };
    @PostMapping("/students/bulk")

    public String addMultipleStudents(@RequestBody ArrayList<Student> studentsList) { 

        return studentH2Service.addMultipleStudents(studentsList);
    };

    @PutMapping("/students/{studentId}")
    public void Student StudentController(@PathVariable("studentId") int studentId, @RequestBody Student student) {
        return studentH2Service.Student;
    }; 

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId){
        return studentH2Service.deleteStudent(studentId);
    }
}