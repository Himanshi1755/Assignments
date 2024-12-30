/*Assignment 5:
Create a parent class Employee with a method calculateSalary() that prints "Base salary calculation for Employee."
Create subclasses:
Manager that overrides calculateSalary() to add a bonus to the base salary.
Developer that overrides calculateSalary() to calculate salary based on hours worked.
Demonstrate the overridden method in the Main class by creating an array of Employee objects and calling calculateSalary() on each. */

import java.util.Scanner;

class Employee {

    void calculateSalary() {
         System.out.println("Base salary calculation for Employee.");
    }
}

class Manager extends Employee{
    Scanner sc = new Scanner(System.in);

    void calculateSalary() {
        System.out.println("Salary for Manager :");
        int salary = sc.nextInt();
        System.out.println("Salary with bonus :" + (salary + 1500));
    }

}

class Developer extends Employee{
    Scanner sc = new Scanner(System.in);

    void calculateSalary() {
        System.out.println("Enter number of hours worked by Developer");
        int d = sc.nextInt();

        System.out.println("Salary with bonus :" + (d * 500));
    }

}

public class Overriding5 {

    public static void main(String[] args) {

        Employee arr[] = new Employee[2];
        arr[0] = new Manager();
        arr[1] = new Developer();
        /* 
        for (int i = 0; i < arr.length; i++) {
            arr[i].calculateSalary();
        }
            */
            for(Employee emp : arr){

                emp.calculateSalary();
            }
    }

}
