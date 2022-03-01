package com.company;

public class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non parametrised constructor
//    Student() {
//        System.out.println("Constructor called");
//    }

    // Parametrised constructor
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    // copy constructor
    Student (Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // required while making copy constructor
    Student() {

    }
}
