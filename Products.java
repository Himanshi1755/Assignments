/* Description: Create a base class Product with attributes like productId, name, and price.

Create subclasses Electronics, Clothing, and Grocery.
Add unique attributes (e.g., warranty for Electronics, size for Clothing, and expiryDate for Grocery).
*/

import java.util.*;

class Product{
int p_ID ;
String name;
double price ;

Product(){
Scanner sc = new Scanner(System.in);
System.out.print("Product_Id : ");
this.p_ID = Integer.parseInt(sc.nextLine());
System.out.print("Product Name : ");
this.name = sc.nextLine();
System.out.print("Price:");
this.price = sc.nextDouble();
}

void displayDetails(){
System.out.println("P_Id  : " + p_ID );
System.out.println("Name  : " + name );
System.out.println("Price : " + price );
}
}

class Electronics extends Product{
int warranty;

Electronics(){
super();
Scanner sc = new Scanner(System.in);
System.out.print("Warranty:");
this.warranty = sc.nextInt();
}

void displayDetails(){
super.displayDetails();
System.out.println("Warranty : " + warranty );
}
}

class Clothing extends Product{
String size;

Clothing(){
Scanner sc = new Scanner(System.in);
System.out.print("Size (Small , Medium , Large):");
this.size = sc.nextLine();
 }

void displayDetails(){
super.displayDetails();
System.out.println("Size : " + size);
}
}

class Grocery extends Product{
String expiry_date;

Grocery(){
Scanner sc = new Scanner(System.in);
System.out.print("Expiry Date :");
this.expiry_date = sc.nextLine();
}
void displayDetails(){
super.displayDetails();
System.out.print("Expiry Date : " + expiry_date);
}
}

class Products{

public static void main(String args[]){

  System.out.println("Enter Electronics Details:");
  Electronics b1 = new Electronics();
System.out.println();
  System.out.println("Enter Cloths Details:");
  Clothing m1 = new Clothing();
System.out.println();
  System.out.println("Enter Grocery Details:");
  Grocery d1 = new Grocery();
System.out.println();    
   System.out.println("--- Electronics Details --- ");
   b1. displayDetails();
        
   System.out.println("--- Cloths Detail ---");
   m1.displayDetails();
        
   System.out.println("--- Grocery Details ---");
   d1.displayDetails();

}
}
/*

--- Electronics Details ---
P_Id  : 11
Name  : Laptop
Price : 39000.0
Warranty : 2
--- Cloths Detail ---
P_Id  : 22
Name  : T-Shirts
Price : 459.0
Size (Small , Medium , Large): Medium
--- Grocery Details ---
P_Id  : 31
Name  : Biscuit
Price : 10.0
Expiry Date : 2024-12-30


*/
