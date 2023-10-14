package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "student_table")
public class Student {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "fees")
    private float fees;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;


}
