package com.example.school.controller;

import java.util.ArrayList;

import com.example.school.model.Student;
import com.example.school.service.StudentH2Service;

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

  
@Autowired
   public void StudentH2Service();

   @GetMapping("/students")
   public ArrayList<Student> getStudents(){
     return StudentH2Service.getStudents();
   };

    @GetMapping("/students/{studentId}")
    public void Student getStudentId(@PathVariable(value="studentId") int studentId) {
        return StudentH2Service.getStudentId(studentId);
    };

    @PostMapping("/students")
     public ArrayList<Student> addStudent(){
        return StudentH2Service.addStudent(Student);
    };
    @PostMapping("/students/bulk")
    public void Student Student addStudent(@RequestBody Student student){
        return StudentH2Service.addStudent(Student);
    };

    @PutMapping("/students/{studentId}")
    public void Student StudentController(@PathVariable("studentId") int studentId, @RequestBody Student student) {
        return StudentH2Service.Student;
    }; 

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId){
        return StudentH2Service.deleteStudent(studentId);
    };

}