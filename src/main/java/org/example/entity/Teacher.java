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
@Table(name = "teacher_table")
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(name = "teacher_name")
    private String name;
    @Column(name = "salary")
    private float salary;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
}
