/*
Create a base class Animal with a method sound() that prints a generic message like "Animals make sound".
Create a subclass Dog that overrides the sound() method to print "Dogs bark".
Use super.sound() in the overridden method to display the parent class's implementation.*/


import java.util.*;

class  Animal{

void sound(){
System.out.println("Animals make sound");
}
}

class Dog extends Animal{

void sound(){
super.sound();
System.out.println("Dogs bark:");
}
}

class Animals{

public static void main(String args[]){
Dog a1 = new Dog();
a1.sound();
}
}
/*

D:\Infobeans\Assignment>java Animals
Dogs bark:

D:\Infobeans\Assignment>javac Animals.java
D:\Infobeans\Assignment>java Animals
Animals make sound
Dogs bark:


*/
