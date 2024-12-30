/*
Employee Categorization by Salary Level

A company maintains a database that includes the details of all employees. Employees are categorized into two levels based on their salary:

Level 1: Top management with a salary of more than $100.
Level 2: Staff with a salary of $100 or less.

Your task is to implement a Java program to categorize employees based on their salary levels.

Requirements:

1. Employee Class:

Attributes:
•	empId (int): The employee's ID.
•	salary (float): The employee's salary.

Methods:
•	Constructor to initialize 'empId' and 'salary'.

2. EmployeeLevel Class:

Inherits from 'Employee'.

Methods:
•	Constructor to initialize 'empId' and 'salary'.
•	Method to determine and return the employee's level based on their salary.
Input format :
•	The input contains the empId and salary of the employee, separated by a space.
Output format :
•	The output should display the empId, salary, and level of the employee, each on a new line.

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
253 46.6
Output 1 :
253
46.6
2
Input 2 :
156 167
Output 2 :
156
167.0
1
*/
import java.util.Scanner;

class Employee{
    private int empid;
    private float salary; 

        Employee(int empid, float salary) {
        this.empid = empid;
        this.salary =salary;
    }
    
      public void set_empid(int empid) {
        this.empid = empid;
    }

      public int get_empid() {
        return empid;
    }

      public void set_amt(float salary) {
        this.salary = salary;
    }

        public float get_salary() {
        return salary;
    }


}

class EmployeeLevel extends Employee {
private String receipt;


      public EmployeeLevel(int empid, float salary) {
        super(empid, salary);    }

int level(){
if(get_salary() > 500){
 return 1;
}
else {
return 2;
}
}  
}

public class EmployeeD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);             
        System.out.print("Employee Id :");
        int empid = sc.nextInt();
        System.out.print("Salary :");         
        float amt = sc.nextFloat();

EmployeeLevel e1 = new EmployeeLevel(empid, amt);
//EmployeeLevel e1 = new EmployeeLevel(253 , 46.6);

System.out.println();
System.out.println( e1.get_empid());
System.out.println( e1.get_salary());
System.out.println( e1.level());
             
    }
}
/*

D:\Infobeans\Assignment>java EmployeeD
Employee Id 111
Salary $ :600

111
600.0
1

*/