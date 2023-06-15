package com.schoolmanagement.domain;

import lombok.*;

import javax.persistence.*;


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
    private String email;


    @Embedded
    private EntitiyVariables entitiyVariables;
}
