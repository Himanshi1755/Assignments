/*
Description: Create a base class Institution with attributes name and location.

Create subclasses School, College, and University.
Add unique attributes (e.g., numOfStudents for School, coursesOffered for College, and researchPrograms for University).
Add methods to display information specific to each subclass.
*/

import java.util.*;

class Institution{
String name;
String location;

Institution(){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Institution Name : ");
this.name = sc.nextLine();
System.out.print("Location :");
this.location = sc.nextLine();
}

void displayDetails(){
System.out.println("Name : " + name );
System.out.println("location : " + location );
}
}

class School extends Institution{
int no_of_students;

School(){
super();
Scanner sc = new Scanner(System.in);
System.out.println("No of Students :");
this.no_of_students = sc.nextInt();
}

void displayDetails(){
super.displayDetails();
System.out.println("Total Students : " + no_of_students );
}
}

class Collage extends Institution{
String coursesOffered;

Collage(){
//super();
Scanner sc = new Scanner(System.in);
System.out.print("Courses :");
this.coursesOffered = sc.nextLine();
 }

void displayDetails(){
super.displayDetails();
System.out.println("Course : " + coursesOffered);
}
}

class University extends Institution{
String researchPrograms;

University(){

Scanner sc = new Scanner(System.in);
System.out.print("Research Programs :");
this.researchPrograms = sc.nextLine();
}
void displayDetails(){
super.displayDetails();
System.out.println("Research Programs : " + researchPrograms);
}
}

class Institutions1{

public static void main(String args[]){

  System.out.println("Enter School Details:");
  School b1 = new School();
System.out.println();
  System.out.println("Enter Collage Details:");
  Collage m1 = new Collage();
System.out.println();
  System.out.println("Enter Univertity Details:");
  University d1 = new University();
System.out.println();    
   System.out.println("--- School Details --- ");
   b1. displayDetails();
        
   System.out.println("--- Collage Detail ---");
   m1.displayDetails();
        
   System.out.println("--- University Details ---");
   d1.displayDetails();

}
}
/*
botics
--- School Details ---
Name : Medatwal Girls School
location : Chotta Bangarda
Total Students : 500
--- Collage Detail ---
Name : IIT Indore
location : abs
Course : Btech (IT)
--- University Details ---
Name : RGPV
location : Bhopal
Research Programs : Artigicial Integgigence , REnewable Energy,Robotics

*/
