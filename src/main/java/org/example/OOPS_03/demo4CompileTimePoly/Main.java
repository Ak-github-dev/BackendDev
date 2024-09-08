package org.example.OOPS_03.demo4CompileTimePoly;

public class Main  {
    public static void main(String[] args) {
        printer p = new printer();

        p.print();
        p.print("Aamir");
        // hence before even running java compiler knows what method to call,
        // hence compile time polymorphism
    }
}
