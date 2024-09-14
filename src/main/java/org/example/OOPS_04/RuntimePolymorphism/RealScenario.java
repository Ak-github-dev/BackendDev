package org.example.OOPS_04.RuntimePolymorphism;

import java.util.Random;

public class RealScenario {
    public static void main(String[] args) {
        //Hence the compiler does not know who is login in advance
        //randomly either student is going to login or Instructor is going to login
        for(int i = 0; i < 3; i++){
            User user = getObj();
            user.login();
        }

        //If there was no runtime polymorphism then we would be writing like below
        //instanceof: special keyword in Java, that is used to check type of object
        // present in this user variable
//        if (user instanceof Student){
//            //trigger student login
//        } else {
//            //trigger instructor login
//        }
        // hence in real life we will have many forms of users,
        // leading to many if else conditions
        // hence to avoid that we have method overriding/ runtime polymorphism

    }

    public static User getObj(){
        Random r = new Random();
        int random = r.nextInt();
        if (random%2==0){
            return new Student();
        }
        return new Instructor();

    }
}

class User{
    String username;
    String password;

    void login(){
        System.out.println((username + " is logging in"));
    }
}

// below classes show that how overriding works as Instructor or Student has different dashboards
class Instructor extends User{
    void login(){
        System.out.println((username + " is a instructor and login in"));
    }
}


class Student extends User{
    void login(){
        System.out.println((username + " is a student and login in"));
    }
}
