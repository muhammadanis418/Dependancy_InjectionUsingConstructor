package com.example.dependancy_injectionusingconstructor;

public class Student {
    private int id;
    private String name;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Student Name is:" + name +" & Student id is: " + id);
    }

}
