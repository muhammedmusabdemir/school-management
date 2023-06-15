package com.schoolmanagement.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motherName;
    private String fatherName;

    @Column
    private int studentNumber;

    @Column(unique = true)
    @Email
    private String email;
    private boolean isActive;


    @Embedded
    private EntityVariables entityVariables;

}
