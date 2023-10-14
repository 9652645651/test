package org.example.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class StudentDto {

    private Long id;


    private String name;

    private float fees;

    private String email;

    private String mobileNumber;

    public StudentDto(Long id, String name, float fees, String email, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
}











