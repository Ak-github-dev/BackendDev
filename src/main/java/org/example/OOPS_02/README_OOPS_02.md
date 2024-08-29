OOPS 2

Object Oriented Programming System

Abstraction:
1. Hide complex internal implementation
2. Envision a complex system in terms of ideas/entities

Encapsulation:
1. Holds data/attr & behaviours together --> class
2. Protect attr & behaviours --> access modifiers


Access Modifiers:
defines how accessible is a member(methods,attributes) of a class.

class Student{
access_modifier data_type attr_name;			--> attribute --> public int age, private String name
access_modifier return_data_type method_name(...){	--> Method --> protected void changeBatch()
}
}

four types of AM:
1. private - 
Then that member is only accessible within the class. No other code outside the class can access that member.
If tried to access in any other class we will get compile time error.
We can print age in a behaviour in the same class.
Neither the class in same package can access this.
For example a users aadhaar details.
Generally keep all private when starting and then change if required as it is the strictest one.
Way to access but not overwrite: Getters and setters:
public int getAge(){
    return age;}
public void setAge(int age){
   this.age = age;}
Intellij directly generate getters and setter using

2. default - 
To use this don't write anything. Any class within package can access this member.
Not accessible in different package.

3. protected - 
Any member which is protected can be accessed within the package 
It can also be accessed via its child(Inheritance class in a different package.
Q 1) Does it work other way around, like parent able to access protected attributes of child.

4. public - Most lenient access modifier. A public member can be accessed from anywhere.

class Student{
    private int age;
    String email;
    protected double psp;
    public String name;

	private boolean coursePause(){...}
	void getInstructor(){...}
	protected void joinClass(){..}
	public void changeBatch(){...}
}


| Access Modifier | Same class | Different class Same Package | Child class Diff Package | Diff Class Diff package |
|-----------------|------------|------------------------------|--------------------------|-------------------------|
| private         | Yes        | No                           | No                       | No                      |
| default         | Yes        | Yes                          | No                       | No                      |
| protected       | Yes        | Yes                          | Yes                      | No                      |
| public          | Yes        | Yes                          | Yes                      | Yes                     |