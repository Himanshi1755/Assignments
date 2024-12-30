/* 1.
You are tasked with developing a Java program to manage employee records. The program should allow users to input the first name, last name, employee ID, and job title of an employee. Once the user inputs these details, the program should display the employee's information, including their full name, employee ID, and job title.

Requirements:

Create a class Person with the following attributes:
•	firstName - String
•	lastName - String

This class serves as a base class for other classes and will be extended by the 'Employee' class.

Create a class 'Employee' that extends the 'Person' class:

•	Inherits attributes firstName and lastName from Person.
•	Has additional attributes:
1.	employeeId - int
2.	jobTitle - String
•	Implement getters, setters, and constructors for all the above-mentioned attributes in both Person and Employee classes.

Create a class named 'Main' which contains the main method where program execution begins:

•	It prompts the user to input the details of an employee.
•	It creates an Employee object with the provided details.
•	It displays the employee's information using the getters implemented in the 'Employee' class.
Input format :
•	The first line consists of a String that represents firstName.
•	The second line consists of a String that represents lastName.
•	The third line consists of an int that represents the employeeId.
•	The fourth line consists of a String that represents the jobTitle.
Output format :
•	The output should display the employee details in the following format:
Employee details:
Name: <firstName> <lastName>, <jobTitle>
Employee ID: <employeeId>

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
John
Mathew
120948
Developer
Output 1 :
Employee details:
Name: John Mathew, Developer
Employee ID: 120948
Input 2 :
Tony
Stark
98364
Senior Program Manager
Output 2 :
Employee details:
Name: Tony Stark, Senior Program Manager
Employee ID: 9836
  */

import java.util.*;

class Person{
String f_name;
String l_name;

Person(){
Scanner sc = new Scanner(System.in);

System.out.print("Enter First Name : ");
this.f_name = sc.nextLine();
System.out.print("Enter last Name:");
this.l_name = sc.nextLine();
}

void displayDetails(){
System.out.println("Name : " + f_name + " " + l_name );
}
}

class Employee extends Person{
int emp_id;
String job_title;

Employee(){
super();
Scanner sc = new Scanner(System.in);
System.out.println("Enter Emp_id :");
this.emp_id = Integer.parseInt(sc.nextLine());
System.out.println("Job_Title :");
this.job_title = sc.nextLine();
}

void displayDetails(){
super.displayDetails();
System.out.println("Emp_id: " + emp_id );
System.out.println("Job Title : " + job_title );
}
}


class Main{

public static void main(String args[]){

  Employee b1 = new Employee();
   System.out.println();
   System.out.println("--- Employee Details --- ");
   b1.displayDetails();

}
}





