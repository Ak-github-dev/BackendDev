package org.example.OOPS_04.Interfaces;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("eating dog");
    }

    @Override// annotation for developer to help dev avoid mistakes
    public void walk() {
        System.out.println("walking dog");
    }

    @Override
    public void run() {
        System.out.println("running dog");

    }
}
