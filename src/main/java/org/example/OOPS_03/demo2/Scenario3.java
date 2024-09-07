package org.example.OOPS_03.demo2;

public class Scenario3 {
}

class AAA{
    public AAA(){
        System.out.println("AA");
    }
}

class BBB extends AAA{
    //public BBB(){
    public BBB(String S){
        //private BB(){
        System.out.println("BB");
    }
}

class CCC extends BBB{
    public CCC(){//There is no parameterless constructor available in 'org.example.OOPS_03.demo2.BBB'
        super("Hello");//As super keyword used hence chain is not broken as it will find the constructor and point the parameter
        System.out.println("CC");
    }
}
