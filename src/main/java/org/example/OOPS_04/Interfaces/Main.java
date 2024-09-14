package org.example.OOPS_04.Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.walk();
        a.run();

        //a = new Animal();//'Animal' is abstract; cannot be instantiated
    }
}
