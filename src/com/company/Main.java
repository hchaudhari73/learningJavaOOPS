package com.company;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Harshal";
        s1.age = 25;

        Student s2 = new Student(s1);

        s1.printInfo();
    }
}
