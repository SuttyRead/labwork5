package com.ua.sutty.labwork5.controller;

import com.ua.sutty.labwork5.form.StudentForm;
import com.ua.sutty.labwork5.model.Student;
import com.ua.sutty.labwork5.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin
@Slf4j
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/registration")
    public ResponseEntity<Student> registration(@RequestBody StudentForm studentForm) {

        if (studentForm == null) {
            log.trace("StudentForm is null");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Student student = studentForm.toStudent();
        studentRepository.save(student);

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}
