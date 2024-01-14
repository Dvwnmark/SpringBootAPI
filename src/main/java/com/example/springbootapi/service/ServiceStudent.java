package com.example.springbootapi.service;

import com.example.springbootapi.entity.Student;

import java.util.List;

public interface ServiceStudent {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public Student getStudentById(Long studentId);
    public void deleteById(Long studentId);
    public Student updateStudent(Student student);


}
