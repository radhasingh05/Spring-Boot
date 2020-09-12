package com.radha.core;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class    Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stud_id")
    private int studId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
