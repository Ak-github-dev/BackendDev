Compile time polymorphism:
Achieved by Method overloading:
creating multiple methods with same name and different signatures


## 2. Runtime Polymorphism

Achieved by Method overriding.

Child will #Override# Parent's behaviour

Applicable to only behaviours not attributes


Example 1:(link)
class A{
public print(){
sop("A");
}
}

class B extends B{
public print(){
sop("B");
}
}

class C extends B{
public print(){
sop("C");
}
}

Code:
A a = new C();
a.print();
-->logically it may seem it will print A, but due to method overriding
it will print C
As C is the object here and it has access to methods of A, but it will override, but if we had no print method in C and B then then it would have printed A.
real example like learning recipe from mom, if we did not have our own updated recipe then we will use mom recipe but if we update our version then
we will use this new recipe/method overriding mom recipe.

a = new B();
a.print();
-->B

a = new A();
a.print();
-->A

Depending upon which obj is stored in the parent var, the stored obj's method will be called

The stored obj has 2 options:
1. Either to get that method from parent via inheritance
2. Override


Example 2:
class A{
public print(){
sop("A");
}
}

class B extends B{

}

class C extends B{
public print(){
sop("C");
}
}


A a = new C();
a.print();
-->B


a = new B();
a.print();
-->A

a = new A();
a.print();
-->A


(link) Check
Runtime Polymorphism example java code


- If a class doesnt have a overriden method, then it will inherit it from its parent as per inheritance & it will be called.

- For method overriding to work, the overriden method should have exact same method signature as per parents method.

- In cases where we want to also call parents overriden method we can use the super keyword.



Example 3:(link)

class A{
public print(){
sop("A");
}
}

class B extends B{
public print(){
super.print();
sop("B");
}
}

class C extends B{
public print(){
sop("C");
}
}


A a = new C();
a.print();
-->C


a = new B();
a.print();
--> because of super , first it will call parents method and then execute of its own
A
B

a = new A();
a.print();
-->A




## Interfaces

Class is a # Blueprint of entity.

Class has 1. attributes and 2. behaviours

A concept which is not really an entity i.e. it doesnt has attributes but has abstract(no clarity) behaviours.

1. Anybody who swims is a swimmer.--> we are not specifying here how one is swimming front stroke or back stroke, etc, hence it can be Dog swimming, Penguin swimming.
2. If something can eat, walk and run, then something is an animal --> we are not specifying how one is eating, walking etc.



Interfaces--> Blueprint of behaviours

interface Animal{
void eat(); --> abstract method: where there is no implementation. We do not need(optional) to add "public abstarct" before void for these method. java will do it by itself

	void walk();

	void run();
}


Now lets see how one can use this concept:

When parent is an interface we use implements keyword instead of extends

And once we use implements keyword and we had not given any body to these methods in the interface, hence java will force us to give some body to these methods
as below print etc.
We are doing runtime overriding here.

class Dog implements Animal{
void eat(){
print("Dog is eating")
}
void run(){
print("Dog is running")
}
void walk(){
print("Dog is walking")
}

}

A class which is implementing an interface, needs to implement all the methods that are present in the inetrface.

Animal a = new Dog()		--> allowed

a.eat();			--> child Dog eat method will be called

Animal a = new Animal();	--> Not allowed. We cannot create objects of an interface as there is no implementation for eat, walk, etc

Anonymous classes:
these classes enablesyou to make your code more concise. They enable you to declare and instantiate a class at the same time.
They are like local classes except that they do not have a name. Use them if you need to use a local class only once.



Example 1:
Can we say that any DS which follows LIFO for insertion and removal and supports methods like push(), pop(), top() & isEmpty() to be a "Stack".

--> so here we get that any class which has these four methods push, pop, etc is a stack. So if we want to represnt in OOPs then we better use Interface as no attributes.

interface stack{
int top();
int pop();
void push(int s);
boolean isEmpty();
}

How many ways stack can be implemented:
1. linked list
2. arrays
3. queues

1. LL:
   class LLstack implements stack{
   LL ll = new LL();

   int top(){
   ...}

   int pop(){
   ...}
   ...
   }

Similarly 2. Array:
class ArrayStack implements stack{
ArrayLL l = new ArrayList;
int top(){
...
}
...
}


Now main class

psvm(){
Stack S = new LLStack();--> just by changing the object to ArrayStack then we can switch to array based LL
--> example just by changing the object we can change time complexities of code

	s.top();
	s.push();
	s.pop();
}


Example 2:
class UserService{--> Purpose of service class is to handle all the business logic related to user, eg how will the user be created , notification etc
MySQLDriver db; --> This attribute MySQLDriver: The purpose of this class MySQLDriver is to interact with mysql db and do operations on it and hence making UserService class and DB tightly coupled

	public User saveUser(User u){
		....
		return db.insertUser(u);
	}

	public User updateUser(User updated){
		....
		return db.updateUser(updated.getId(),updated);
	}


So now manager gave 2 tasks:
1. migrate Data
2. Update code to work with mongo

so lets say for task 2: we need to change the attribut class and other peices in code to make it work
class UserService{
MongoDriver mdb;

	public User saveUser(User u){
		....
		return mdb,insert("user",u);
	}

	public User updateUser(User updated){
		....
		return mdb.update("user",u.getId(),user,newUpdateOptions().upset(false));
	}
}

SO imagine if there are 100 classes, and we will need to update code for all the services which are interacting with theDB layer,
hence we write an ideal code:
Create an inetrface called DB operations:

interface UserDBOperations{
User insert();
User update(int id,User update);
void delete();
}

Create an implementation for MySQl:
class MySQLOperations implements DBOperations{
MySQLDriver driver;

}


and then,
class UserService{
DBOperations db; --> and then we can interchange the = part like DBOperations db = new MYSQLOperations(); OR DBOperations db = new MongoOperations();

	public User saveUser(User u){
		....
		return db.insert(u);
	}

	public User updateUser(User updated){
		....
		return db.update(updated.getId(),updated);
	}
}
and so when manager gives to change to mongo then we can just create class for mongo and update the = part

class MongoOperations implements DBOperations{
MongoDriver mdb;

	void insert(){...}
	...
}

This whole above is called ADAPTER DESIGN PATTERN

Hence the learning or
principle is: Always code against an interface and never against an implementation.