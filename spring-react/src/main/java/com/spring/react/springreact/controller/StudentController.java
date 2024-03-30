package com.spring.react.springreact.controller;

import com.spring.react.springreact.model.Student;
import com.spring.react.springreact.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    private static final String SUCCESS = "Successfully saved new Student";
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return SUCCESS;
    }

    @GetMapping()
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

//    @DeleteMapping("/students/{id}")
//    public void deleteStudent(@RequestParam Integer id) {
//         studentService.deleteStudent(id);
//    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer id) {
        studentService.deleteStudent(id);
    }
}