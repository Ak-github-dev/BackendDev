package org.example.OOPS_04.Abstract;

public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal();//'Animal' is abstract; cannot be instantiated
        Animal a = new Dog();
        //Cat cat = new Cat();//'Cat' is abstract; cannot be instantiated
        a.walk();
    }
}
