package com.radha;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "user")
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String userName;

}
