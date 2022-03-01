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

class Horse extends Animal {
    public void walks() {
        System.out.println("Horse walks on four legs");
    }
}

class Chicken extends Animal {
    public void walks() {
        System.out.println("Walks on two legs");
    }
}

//------------------------- Interface -----------------------------
// As we can see above, Horse can use walk function from the abstract class.
// And that is why is not pure abstraction.

// On the other hand Interfaces are pure abstractions
// Multiple inheritance can be done using Interfaces
// but not by using Classes.
interface IAnimal {
    // properties are static, and can't be changed.
    int eyes = 2; // This can't be change.
    void walks();
    void eats();
}

public class IHorse implements IAnimal {

    public void walks() {
        System.out.println("Horse walks on four legs");
    }

    public void eats() {
        System.out.println("Horse eats");
    }
}