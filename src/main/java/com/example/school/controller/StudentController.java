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
   @PostMapping("/students")
    public Student addSingleStudent(@RequestBody Student student) {
        return studentH2Service.addSingleStudent(student);
    };
    @PostMapping("/students/bulk")

    public String addMultipleStudents(@RequestBody ArrayList<Student> studentsList) { 

        return studentH2Service.addMultipleStudents(studentsList);
    };

    @GetMapping("/students/{studentId}")
    public void Student Object getStudentByStudentId(@PathVariable(value="studentId") int studentId) {
        return studentH2Service.getStudentByStudentId(studentId);
    };
    

    @PutMapping("/students/{studentId}")
    public void Student StudentController(@PathVariable("studentId") int studentId, @RequestBody Student student) {
        return studentH2Service.Student;
    }; 

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId){
        return studentH2Service.deleteStudent(studentId);
    };
}