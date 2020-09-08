package com.example.demo.model;


import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -1L;

    private long id;
    private String name;
    private String dob;
    private String area;

    public Person(){

    }
    public Person(long id, String name, String dob, String area) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.area = area;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }



    public String getArea() {
        return area;
    }


}
