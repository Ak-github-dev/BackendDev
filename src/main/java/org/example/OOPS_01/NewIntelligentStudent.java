package org.example.OOPS_01;


// this is for OOPS 2
// Protected AM
// Extends means child class
import org.example.OOPS_02.NewStudent;

public class NewIntelligentStudent  extends NewStudent {
    //Create a Method print
    public void print(){
        System.out.println(name); //name is public
        // System.out.print(age); //'age' has private access in 'org.example.OOPS_02.NewStudent'
        // System.out.print(email);//'email' is not public in 'org.example.OOPS_02.NewStudent'. Cannot be accessed from outside package
        System.out.print(psp); //as child hence psp is allowed
        pauseCourse();//Protected method allowed in child
        //printDetails();//'printDetails()' has private access in 'org.example.OOPS_02.NewStudent'


    }
}
