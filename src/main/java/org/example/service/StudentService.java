package org.example.service;

import org.example.dto.StudentDto;
import org.example.entity.Student;

import java.util.List;

public interface StudentService {
    String save(StudentDto request);

    List<StudentDto> getAllStudentStartWithLetterA();
}
