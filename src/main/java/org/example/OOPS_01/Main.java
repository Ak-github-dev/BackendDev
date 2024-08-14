package org.example.OOPS_01;

public class Main {
    // PSVM is the first entry point in java
    // It will be the first thing to get executed
    // There is green play button on left side allowing us to run it
    // whereas it is not there in the Students class blueprint
    public static void main(String[] args) {
        // Student : Type of the object
        // Bhavik/Aamir/student1 : like a variable
        // new : keyword, java will create memory and allocate certain memory
        // space for that object
        Student student1 = new Student();
        // after above the memory is allocated and the attributes are assigned default values
        student1.name = "Aamir";
        student1.age = 25;
        student1.psp = 100;
        // hence now the space that was reserved for this student1 object has now
        // 3 variables created and their values inside it

        student1.changeBatch();
        student1.joinClass();
        student1.printDetails();

        //Similarly
        Student student2 = new Student();
        student2.name = "John";
        student2.age = 26;
        student2.psp = 95;
        System.out.println();
        student2.printDetails();
    }
}
