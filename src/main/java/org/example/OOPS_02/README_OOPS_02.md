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
1. private - then that member is only accessible within the class. No other code outside the class can access that member.
   If tried to access in any other class we will get compile time error.
   We can print age in a behaviour in the same class.
   neither the class in same package can access this.
   For example a users adhaar details.
   Generally keep all private when starting and then change if required as it is the strictest one.
   Way to access but not overwrite: Getters and setters-
   public int getAge(){
   return age;}
   public void setAge(int age){
   this.age = age;}
   Intellij directly generate getters and setter using

2. default - To use this dont write anything. Any class within package can access this member.
   Not accessible in different package.

3. protected - 1. Any member which is protected can be accessed withinthe package
   2. It can also be accessed via its child(Inheritance class in a different package.
   Q 1) Does it work other way around, like parent able to access protected attributes of child.
4. public - Most linient access modifier. A public member can be accessed from anywhere.

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


Constructors:
int a;	-->Declaration
a=2;	-->Initialization

int a=2;-->Declaration + Initialization

A class has multiple attributes which needs to be initialized when an object is created.

Hence we need to initialize values when we create object out of class:
Student st = new Student();
st.name = Aamir;
st.age = 26;
st.psp = 34.01;

So if developer wants to create new 1000 objects then it will take 1000 * 4 line to create that, which does not seem an optimal way and not a good idea.

Hence we creaqte some common functionality and it will set all the initial values that we ned to give to student object.

A #constructor is a special method used to initialize attributes of a class.

Types:
1. Default
2. No-args
3. Parameterized
4. Copy constructors

1. Default:
   This constructor is given by Java to us when we have not defined out own constructor.
   For example:
   class Student{
   int age;
   public String name;

   // So default constructor looks like below. It is not seen in Intellij. First it will have public (as default will be always public)
   // and then name of the constructor is always the class name and then empty () arguments and the attributes will be given default values based on datatype, example int is 0, string is null
   public Student(){
   this.age = 0;
   this.name = null;
   }
   //

   void coursePause(){

   }
   }

| Data type    | default value |
|--------------|---------------|
| int          | 0             |
| float/double | 0.0           |
| boolean      | false         |
| char         | ''            |
| string       | null          |
| Custom class | null          |


2. No-args Constructor(No arguments/parameters):

This is a custome constructor by the developer.
As per the name this constructor does not take any arguments. It is mostly used to initialize an object with custom default values.

Note: Whenever you create a custom constructr, java compiler wont give you a default constructor.

class Student{
int age;
public String name;

	public Student(){
		this.age = 10;
		this.name = "ABC"; 
	}

}
The only similarity b/w default & no-args constructor is that object creation code looks the same for both.
If there are 5 attributes and we assign only 3 attributes the initialization then rest 2 Java will assign by itself.
As for constructor we can use any of the 4 access modifier like public, default, etc.



3. Parameterized:

These constructors can take multiple parameters.
As no limit on count of parameters.

class Student{
int age;
public String name;

	public Student(String name, int age){
		this.age = age;
		this.name = name; 
	}

}
this means we are reffering to the current object we are inn(here object of class Student)
so the first "name" and "age" refers to the declaration we did below the class student line and
the second "name" and "age" refers to the parameters.

In above example as developer has declared parameterized constructor, the java will not use default constructor. Hence,

Student s1 = new Student("Aamir", 20);	--> This will work

Student s1 = new Student();		--> This will not work, Error


Rules about constructors:
1. 1 class can have multiple constructors
2. Parameterized constructors need to have unique signature
3. Constructor name should be class name.(Can we create a method using same name as the class name)
4. Constructors have Access modifiers:
   a. private: Only class is allowed to create an object
   b. default: only classess in your package can create obj
   c. protected: only class in your package or your child classess can create your obj
   d. public: any 1 can create your object

Signature of a constructor is made up by list of datatypes of arguments that the constructor is accepting.


Ellaboration of point 2 rule:

public Student(String name, String university)
--> Signature: String,String
public Student(String name, int age)
--> Signature: String,int

As above example have unique signature hence we can create multiple constructors like above.
We only care about datatype and not the variable.

More examples:
a.
public Student(String name, int age)
--> Signature: String, int
public Student(int age, String name)
--> Signature: int, String

=> Unique hence allowed

b.
public Student(String name, String university)
--> Signature: String,String
public Student(String name, String email
--> Signature: String,String

=> Not unique hence not allowed

