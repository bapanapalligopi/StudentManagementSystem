package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.dtos.CreateStudentRequest;
import com.example.StudentManagementSystem.dtos.UpdateStudentRequest;
import com.example.StudentManagementSystem.models.Student;
import com.example.StudentManagementSystem.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//creating rest api's
public class StudentController
{
    @Autowired
    StudentService studentService;
    
    @PostMapping("/create")
    public Student createStudent(@RequestBody @Valid CreateStudentRequest createStudentRequest)
    {
        Student student=createStudentRequest.to();
        return  studentService.createStudent(student);
    }
    @DeleteMapping("/delete")
    public Student deleteStudent(@RequestParam("id") int studentId)
    {
        return studentService.deleteStudent(studentId);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("{id}")
    public  Student getById(@PathVariable("id") int id)
    {
        return studentService.getById(id);
    }

}
