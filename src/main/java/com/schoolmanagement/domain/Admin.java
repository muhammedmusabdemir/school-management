package com.schoolmanagement.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    boolean built_in;

    @Embedded
    private EntitiyVariables entitiyVariables;



}
