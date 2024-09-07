package org.example.OOPS_03.demo1;

public class Instructor extends User{
    //Adding new attributes or methods not necessary
    String batchName;
    double avgRating;
    void scheduleClass(){
        System.out.println(username + " Scheduled Class in " + batchName );
    }
}
