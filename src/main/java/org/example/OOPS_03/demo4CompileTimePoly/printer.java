package org.example.OOPS_03.demo4CompileTimePoly;

public class printer {
    void print(){
        System.out.println("I am empty");
    }

    void print(String s){
        System.out.println("I am "+s);
    }
   // not allowed as signature is still same even if return type is not same.
//    String print(String a)
//    {
//        System.out.println("i am");
//        return "";
//    }


}
