package com.radha.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
@Data
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="category")
    private String category;
    @Column(name="author")
    private String author;
    @Column(name="publisher")
    private String publisher;
    @Column(name="edition")
    private String edition;
}
