package com.company;

public class Polymorphism {

    /*
        Overloading:
        It is compiled time polymorphism.
        We have defined all three functions
        with the same name, but we are passing
        different types of arguments init.
        So while calling the function `printInfo`,
        depending on it's input parameters, it will
        output the result.
     */

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

}
