package com.example.school.repository;

import java.util.*;

import com.example.school.model.Student;

public interface StudentRepository {
  ArrayList<Student> getStudents();
  Student getStudentByStudentId(int studentId);
  Student addStudent(Student student);
  Student updateStudent(int studentId);
  void deleteStudent(int studentId);
}