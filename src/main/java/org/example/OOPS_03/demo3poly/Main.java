package org.example.OOPS_03.demo3poly;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("debug");

        A a = c;
        System.out.println(a.a);
        System.out.println(a.b);
        // Not allowed as attribute c is not accesible to parent class A
        //System.out.println(aa.c);//Cannot resolve c
    }
}

class A{
    int a,b;
}

class B extends A{
    int c;
}

class C extends B{
    int d;
}