package com.example.demo.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String test() {
        return "hello";
    }

    private final StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> optionalStudent = studentRepository.findStudentByEmail(student.getEmail());
        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("Email taken.");
        }
        studentRepository.save(student); // add to db
    }

    public void deleteStudent(Long id) {
        boolean exists = studentRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Student does not exist!");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with Id:"
                        + studentId + "does not exist!"));

        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)
        ) {
            student.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)
        ) {
            if (studentRepository.findStudentByEmail(email).isPresent()) {
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
    }

//    public List<Student> getStudents() {
//        Student student = new Student(1L,
//                "Kevim",
//                "Kevin.Jasom@gmail.com",
//                LocalDate.now(),
//                21);
//
//        student.setName("Mariam");
//        student.setId(1L);
//        return List.of(student);
//    }

}
