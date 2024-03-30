package com.spring.react.springreact.service;

import com.spring.react.springreact.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getStudents();
    public void deleteStudent(Integer id);
}
