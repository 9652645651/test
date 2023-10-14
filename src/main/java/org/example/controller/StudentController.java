package org.example.controller;

import org.example.dto.StudentDto;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @Autowired
    StudentRepository repository;
    @PostMapping("/save-student")
    public String saveStudent(@RequestBody StudentDto request){



        Student saveStudent = new Student();
        saveStudent.setId(request.getId());
        saveStudent.setName(request.getName());
        saveStudent.setFees(request.getFees());
        saveStudent.setMobileNumber(request.getMobileNumber());
        saveStudent.setEmail(request.getEmail());
        Student student=  repository.save(saveStudent);





        return   "saved";
    }

     @GetMapping("/get-All-students-start-with-letter-a")
    public List<StudentDto> getAllStudentStartWithLetterA(){
        return service.getAllStudentStartWithLetterA();
     }


}
