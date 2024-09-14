package org.example.OOPS_04.RuntimePolymorphism;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        A a = new C();
        a.print();

        a = new B();
        a.print();

        a = new A();
        a.print();

        A obj = getObj();
        obj.print();

        for (int i=0;i<3;i++){
            obj.print();
        }
    }

    // this below method shows that this is runtime polymorphism
    public static A getObj(){
        Random r = new Random();
        int random = r.nextInt();
        if (random%3==0){
            return new A();
        }
        if(random%3==1){
            return new B();
        }
        return new C();

    }

}


class A{
    public void print(){
        System.out.println("A");
    }
}

class B extends A{
    public void print(){
        System.out.println("B");
    }
}

class C extends B{
    public void print(){
        System.out.println("C");
    }
}