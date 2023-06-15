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
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isAdvisor;

    @Column(unique = true)
    @Email
    private String email;


    @Embedded
    private EntityVariables entityVariables;
}
