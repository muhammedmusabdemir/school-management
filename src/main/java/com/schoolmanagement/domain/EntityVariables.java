package com.schoolmanagement.domain;

import com.schoolmanagement.enums.Gender;
import com.schoolmanagement.enums.UserRole;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Embeddable
public class EntityVariables {

    @NotBlank
    @Column(unique = true)
    private String userName;

    @NotBlank
    @Column(unique = true)
    @Size(min = 11, max = 11)
    private String ssn;

    @NotBlank
    @Size(min = 3)
    private String name;

    @NotBlank
    @Size(min = 3)
    private String surName;

    @NotBlank
    private LocalDate birthDay;

    @NotBlank
    private LocalDate birthPlace;

    @NotBlank
    @Size(min = 5)
    private String password;

    private UserRole UserRole;

    @Column(unique = true)
    private String phoneNumber;

    private Gender gender;


}
