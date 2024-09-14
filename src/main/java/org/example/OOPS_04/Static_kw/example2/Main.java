package org.example.OOPS_04.Static_kw.example2;

public class Main {
    public static void main(String[] args) {

        Animal one = new Animal("Dog");
        one.age = 5;
        Animal two = new Animal("Cat");
        System.out.println(one.name);
        System.out.println(two.name);
        System.out.println(one.age);
        System.out.println(two.age);
        System.out.println("Changing value now");
        two.age = 10;
        System.out.println(Animal.age);
        System.out.println(one.age);
        System.out.println(two.age);



    }
}

class Animal{
    String name;
    static int age;
    public Animal(String name){
        this.name = name;
    }
}
