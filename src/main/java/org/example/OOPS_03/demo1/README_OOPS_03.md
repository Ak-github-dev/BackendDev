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


