package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.models.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public  Student deleteStudent(int studentId)
    {
        Student student=studentRepository.findById(studentId).orElse(null);
        studentRepository.deleteById(studentId);
        return student;
    }

    public  Student updateStudent(int studentId,Student student)
    {
        return  studentRepository.save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    public  Student getById(int id)
    {
        return studentRepository.findById(id).orElse(null);
    }
}
