package org.example.OOPS_04.Interfaces;

public interface Animal {
    void eat();
    // public abstract is greyed out as it is not compulsory to declare, java will automatically do it
    public abstract void walk();//Modifier 'abstract' is redundant for interface methods
    void run();

}
