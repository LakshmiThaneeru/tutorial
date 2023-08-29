/*
 * You can use the following import statements
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.jdbc.core.JdbcTemplate;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 *
 */

package com.example.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import com.example.school.model.Student;
import com.example.school.repository.StudentRepository;

@Service
public class studentH2Service implements StudentRepository {
    
    @Autowired
    private JdbcTemplate db;

    @Override
    public void deleteStudent(int studentId) {

        db.update("delete from student where studentId = ?", studentId);
      
    }
    @Override
    public String addMultipleStudents(ArrayList<Student> studentsList) { 

        for (Student eachStudent : studentsList) {
            db.update("insert into student(studentName,gender,standard) values (?,?,?)", eachStudent.getStudentName(),
                    eachStudent.getGender(), eachStudent.getStandard());
        }

        String responseMessage = String.format("Successfully added %d students", studentsList.size());
        return responseMessage;
    }

    @Override
    public Student updateStudent(int studentId, Student student) {

        if(student.getStudentName() != null){
            db.update("update student set studentName = ? where studentId = ?", Student.getStudentName(), studentId);
        }
        if(student.getGender() != null){
            db.update("update student set gender = ? where studentId = ?", Student.getGender(), studentId);
        }
        return getStudentByStudentId(studentId);
    }

    @Override
    public Student addStudent(Student student) {

        db.update("insert into student(studentName, gender) values (?, ?)", student.getStudentName(), student.getGender());
        

            Student savedStudent = db.queryForObject("select * from student where studentName = ? and gender = ?",
                                                new StudentRowMapper(), student.getStudentName(), student.getGender());


            return savedStudent;
    }

    @Override
    public Student getStudentByStudent(int studentId) {

      try{
        
        Student student = db.queryForObject("select * from student where studentId = ?", new StudentRowMapper(), studentId);
        
        return student;
        }
      catch (Exception e){

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
      }
      
    }

    @Override
    public ArrayList<Student> getStudents() {

        List<Student> studentList = db.query("select * from student", new StudentRowMapper());
        ArrayList<Student> students = new ArrayList<>(studentList);
        return students;

    }
    

}