package com.example.classwork;

import androidx.annotation.NonNull;

public class Students {
    private String name;
    private int id;
    private String pass;
    private String email;
    private Students(int id, String name, String pass, String email){
        this.id = id;
        this.name = name;
        this.pass= pass;
        this.email= email;
    }
    public static final Students[] students = {};

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getPass() {
        return pass;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return name;
    }
}
