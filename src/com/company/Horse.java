package com.company;

//------------------------- Abstractor -----------------------------

class Abstraction {
    // Bluer print of an initial thought,
    // which won't be directly used.
    // But displays the initial intent
    // of the class.
}

abstract class Animal {
    // We can have both abstract and non-abstract functions
    // It can have a constructor.
    // Constructor chaining:
    // If we have constructor in both, Animal and Horse,
    // while running first Animal constructor will run
    // and then Horse constructor will run.
    abstract public void walks();

    public void eats() {
        System.out.println("Animals eat");
    }
}

public class Horse extends Animal {
    public void walks() {
        System.out.println("Horse walks on four legs");
    }
}

class Chicken extends Animal {
    public void walks() {
        System.out.println("Walks on two legs");
    }
}

