package com.radha;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonRootName("Student")
public class Student {

    @NotNull
    @NotBlank
    private String name;
    @NotNull
    private String cls;
    @Size(min = 2,max = 50)
    private String country;

    public Student(String name, String cls, String country) {
        super();
        this.name = name;
        this.cls = cls;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCls() {
        return cls;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
    }
}
