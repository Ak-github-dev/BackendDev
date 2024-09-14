package org.example.OOPS_04.Abstract;

abstract public class Animal {

    String name;
    int age;
    void printName(){
        System.out.println(name);
    }
    //abstract method hence use abstract keyword
    abstract void walk();
    // child class responsibility to override walk
}
