package org.example.OOPS_01;

//Package: Like a folder, whatever set of classes belong together we will group them together

//class Student : Blueprint
public class Student {
    // Attributes
    int age;
    String name;
    float psp;
    int defaultCheck; //Default access modifier for OOPS2

    // Behaviours
    void changeBatch(){
        System.out.println("Change Batch");
    }

    void joinClass(){
        System.out.println(name + " is Joining Class" + defaultCheck);
    }

    void printDetails(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("PSP " + psp);
    }


}
//Step 1 Completion: Created a blueprint of Student
// No data yet
// To create Objects we will use Main class