##Inheritance

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

Solution for this scenario is to use keyword super in class C:
class C extends B{
public C(){
super("Hello")
print("C")
}
}


