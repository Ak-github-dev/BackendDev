package org.example.OOPS_02;

public class NewStudent {
    private int age;
    String email;
    protected double psp;
    public String name;

    private boolean coursePause(){
        System.out.println("Student" + name + " is paused");
        return false;
    }
    void getInstructor(){
        System.out.println("Student with email" + email + " is instructor");
    }
    protected void joinClass(){
        System.out.println("Student is joined with psp" + psp);
    }

    public void changeBatch(){
        age++;
        System.out.println("Student is changed with age "+ age);
        printDetails(); // this is possible because even if age is private and printDetails private but using in same class
    }

    private void printDetails(){
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Email" + email);
        System.out.println("PSP" + psp);
    }
    // Getters and Setters
    // Alt + Ins --> Windows
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void pauseCourse(){
        System.out.println(name + "Student is paused");
    }
}
