package com.autentia.rest.alumnos.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Student{

    @Id
    private final String nif;
    private final String name;
    private final String surname;
    private final String phone;

    public Student(){
        nif = null;
        name = null;
        surname = null;
        phone = null;
    }

}