package org.example.service.impl;

import org.example.dto.StudentDto;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentRepository repository;

    @Override
    public String save(StudentDto request) {
        Student saveStudent = new Student();
        saveStudent.setId(request.getId());
        saveStudent.setName(request.getName());
        saveStudent.setFees(request.getFees());
        saveStudent.setMobileNumber(request.getMobileNumber());
        saveStudent.setEmail(request.getEmail());
     Student student=  repository.save(saveStudent);
        if (student.getId() != null) {
        return "save success";
        }
        return "not saved";
        }

    @Override
    public List<StudentDto> getAllStudentStartWithLetterA() {

    List<Student> studentList= repository.findAll();
        List<StudentDto> studentDtoList = new ArrayList<>();

            for(Student  data:studentList) {
//                StudentDto dto = new StudentDto();
//                dto.setEmail(data.getEmail());
//                dto.setName(data.getName());
//                dto.setMobileNumber(data.getMobileNumber());
//                dto.setFees(data.getFees());

                studentDtoList.add(new StudentDto(data.getId(),data.getName(),data.getFees(),data.getEmail(),data.getMobileNumber()));

                //studentDtoList.add(dto);

            }



        return studentDtoList;
    }

}
