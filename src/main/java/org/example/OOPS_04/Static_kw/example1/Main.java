package org.example.OOPS_04.Static_kw.example1;

public class Main {
    public static void main(String[] args) {
        System.out.println(ABC.s); //Intellij makes s and print Italic for static
        ABC.print();

        ABC abc = new ABC();
        System.out.println(abc.s);//Static member 'org.example.OOPS_04.Static_kw.ABC.s' accessed via instance reference
        abc.print();//Static member 'org.example.OOPS_04.Static_kw.ABC.print()' accessed via instance reference
    }
}


class ABC{
    static String s;
    static void print(){
        System.out.println("I am static method");
    }
}
