/*  Description: Create a class LibraryItem with attributes title, author, and yearPublished.

Create subclasses Book, Magazine, and DVD.
Add unique features (e.g., genre for Book, volume for Magazine, and runtime for DVD).
Add a method displayDetails() to show specific details for each subclass.

*/

import java.util.*;

class LibraryItem{
String title;
 String author;
int yearPublished;


LibraryItem(){

Scanner sc = new Scanner(System.in);
this.title = title;
this.author = author;
this.yearPublished = yearPublished;

System.out.println("Enter Title of the Book : ");
title = sc.nextLine();
System.out.println("Author :");
author = sc.nextLine();
System.out.println("Publised Year : ");
yearPublished = sc.nextInt();
}

void dislpayDetails(){
System.out.println("Title : " + title );
System.out.println("Author : " + author );
System.out.println("Published Year : " + yearPublished);
}
}

class Book extends LibraryItem{
String genre;
//Book(String genre){

Book(){
super();
Scanner sc = new Scanner(System.in);
System.out.println("Genre :");
this.genre = sc.nextLine();
}

void dislpayDetails(){
super.dislpayDetails();
System.out.println("Genre : " + genre);

}
}

class Magazine extends LibraryItem{
int volume;
//Magazine(int volume){

Magazine(){
//super();
Scanner sc = new Scanner(System.in);
System.out.println("Volume :");
this.volume = sc.nextInt();
 }

void dislpayDetails(){
super.dislpayDetails();
System.out.println("Volume : " + volume);

}
}

class DVD extends LibraryItem{
int runtime;
//DVD(int runtime){

DVD(){
//super();
Scanner sc = new Scanner(System.in);
System.out.println("Runtime :");
this.runtime = sc.nextInt();
}
void dislpayDetails(){
super.dislpayDetails();
System.out.println("Runtime : " + runtime);
}
}

class Library{

public static void main(String args[]){
//LibraryItem l1 = new LibraryItem("", "", 0);

  System.out.println("Enter Book Details:");
  Book b1 = new Book();
        
        System.out.println("Enter Magazine Details:");
        Magazine m1 = new Magazine();

        System.out.println("Enter DVD Details:");
        DVD d1 = new DVD();

     
        System.out.println("--- Book Details --- ");
        b1. dislpayDetails();
        
        System.out.println("--- Magazine Detail ---");
        m1.dislpayDetails();
        
        System.out.println("--- DVD Details ---");
        d1.dislpayDetails();

}
}

/*
--- Book Details ---
Title : Panchantra
Author : Vishnu Sharma
Published Year : 300
Genre : Fable
--- Magazine Detail ---:
Title : Panchantra
Author : Vishnu Sharma
Published Year : 300
Volume : 5
--- DVD Details ---
Title : Panchantra
Author : Vishnu Sharma
Published Year : 300
Runtime : 120
*/