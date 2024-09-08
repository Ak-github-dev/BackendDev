##Inheritance##

OOP is based upon thinking of s/w systems in terms at day to day systems.

In real life we see hierarchy/relationship b/w diff things for the sake of understanding.

OOP also allows us to form hierarchies via the 3rd pillar of OOP called as Inheritance.

							Animal
				Mammal			Reptile		Acquatic	
	Dog			Cat		Human
Pug	Husky	German Shepherd

Pug is a Dog		-->whenever there is a relationship then here Pug is ##Child and Dog is the ##Parent
All Dog is not Pug

Dog is a Mammal.	
Mammal is an Animal	-->Mammal is Child and Animal is Parent

Just like in real life we inherit belongings from our parents/grandparents


Inheritance in OOp programming allows us to inherit methods(behaviours) and attributes of parents( depending upon access modifiers)

Whenever in real life you find 2 entities having 'IS-A' relationship then we can represent them in OOP way using inheritance.

Example: Scaler

|		User		^
|Instructor	Mentor	Student	|
|				|
\/				|

Terms:
User is parent/Super/Base class and others are child/sub-class/derived


In Java inheritance is done using the ##Extends keyword.
Child class may or may not add their own members.

Class User{
String username;
void login{
}
}

class Instructor extends User{
String batchName;
double avgRating;
void scheduleClass{
}
}


Code:
Instructor i = new Instructor();
i.batchName = " "
i.avgRating = 4.5
i.username = " " -->username is attribute in parent

{Use Key promoter X Plugin for shortcuts}



Parent class is nothing but a generalization and every child is more specific.
Real example is lets say we need attributes like username and password in all child classes of user , but its not appropriate to keep
repeating attributes in all, hence we can add this common/general attributes to avoid any bugs, etc in User (Parent class), hence
we are avoiding code duplication.

Generally Top most class (here User) is the most generic/highest level of abstraction class.

The more up we go in hierarchy, thing get Generic and if we go down it is more specific.



Demo2: Scenario1:

Example to understand working of Inheritance:
Example 1:
A-->
B-->
C


class A{
public A(){
print("A")
}
}

class B extends A{
public B(){
print("B")
}
}

class C extends B{
public C(){
print("C")
}
}

class Client{
main (){
C c = new C();
}
}

O/p:
Expected:C
Actual: A
B
C

Working :
As we have created new object of C in Client, thus java will go to C and check if C has parent as to create a child it needs parent,
yes so it will go to B and check same, hence goes to A,
and then starts printing output as A will be first executed then B and then c.

While object creation of a child, everything will work correctly if in the inheritance chain all the classes have a default
or no-args constructor and they are accessible.


Demo2:
Example 2:
If in child class B we have private object
class B extends A{
private B(){
print("B")
}
}
O/p: Error
code will stop working as C is not able to reach the parent


Scenario 3:
Example 3:
class B extends A{
public B(String S){
print("B")
}
}

O/P: Error
As chain is again broken due to parameterized constructor induced by developer

1 Solution for this scenario is to use keyword super in class C:
class C extends B{
public C(){
super("Hello")
print("C")
}
}

2nd solution is just add one more constructor in B without args
class B extends A{
public B(String S){
print("B")
}
public B(){
print("B")
}
}


So basically if we want to call a specific constructor of your parent, use #super# keyword





##Polymorphism##

Poly: many
morph: forms

Something which has many forms.

		User
Instructor	Mentor	Student

printName(List<User> users){
for (User u: users)
print(u.username);
}
}


(List<User> users)--> If we have List of user objects. This comes from collections package in java.

So now which types of objects we are allowed to pass here?
--> So we can use any of the forms as Instructor,Mentor, Student is also a User
List<User> u = List.of(new User() or new Instructor(), new Mentor(), new Student()) we will not face any error

We can write :
User u = new user();
User u = new Instructor();
User u = new Mentor();
also like, List<Integer> list = new ArrayList<>()

A variable of type parent can hold a obj of child.

Polymorphism allows us to hold object of child class in a variable of parent class.

class A{
int a,b;
}

class B extends A{
int c;
// as B is child of A it inherits a,b
}

class C extends B{
int d;
// as C is child of B it inherits a,b,c
}

Check what is allowed:

example 1:
A obj = new C();	// allowed as C is child of A, here obj is the variable and A is the datatype. So here it means we are are holding the object of child
// but the datatype is of class A. Also child may or may not introduce its new members. A does not know what members child has.
print(obj.a); // allowed as A knows about a its own members.
print(obj.b); // allowed as A knows about b its own members.
print(obj.c); // not allowed as A does not knows about its child B member c
print(obj.d); // not allowed as A does not knows about its child C attribute d

example 2:
obj = new B(); // type of object has not changed it is still A
print(obj.a); // allowed
print(obj.b); // allowed
print(obj.c); // not allowed. object will internally hold as it is of B,but as the datatype is A it will not be accessible.
print(obj.d); // not allowed



From a parent class variable which is holding a child object, we are allowed to access only members which are accessible by parent.

Types of Polymorphism
1. Compile time
2. Runtime



1. Compile time polymorphism:

(During compilation) Achieved by Method overloading

Method overloading allows us to create multiple methods with same name & different method signature in a class.

Method signature:
method_name(datatype_1, Datatype_2)

Examples:
1.
void print(String s)
void print()
--> Allowed

2.
void print()
void print(String s)
--> Allowed

3.
void print(String s, int a)
void print(String b, int d)
--> not allowed

4.
void print(String a)
String print(String b)
-->Not allowed: even if return type is unique

These checks will be checked at compile time by java compiler hence compile time polymorphism.



