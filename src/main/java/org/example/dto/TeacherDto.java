package org.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeacherDto {

    private Long teacherId;


    private String name;

    private float salary;

    private String phoneNumber;

    private String email;
}
