package com.company;

class Inheritance {

    // Increases usability of code.

}

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Rectangle extends Shape {
    // First type:
    // Single level inheritance
    public void area(int l, int h) {
        System.out.println(l * h);
    }
}

class EquilateralTriangle extends Rectangle {
    // Second type:
    // Multi level inheritance
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

class Circle extends Shape {
    // Third type:
    // Hierarchical inheritance
    // One base class but multiple derived classes
    // Like here, we have Shape as base class
    // and Rectangle and Circle as derived class.
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

// Fourth type:
// Hybrid inheritance
// Here we can see multiple types of inheritances
// from the above three.
