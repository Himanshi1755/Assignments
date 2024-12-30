/*Create a base class Shape with an attribute color and a method displayColor().
Create a subclass Circle with an attribute radius.
Use a constructor in Circle to initialize color using super.
Add a method calculateArea() in Circle and call displayColor() using super. */
import java.util.*;
class Shape{
String color ;

Shape(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Color : ");
this.color=sc.nextLine();
}

void display_color(){
System.out.println("Color : " + color);
}
}

class Circle extends Shape{
int radius;
//Circle(String color, int radius) {
//super(color);  
Circle(){
super();
Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius");
this.radius=sc.nextInt();
}

void calculateArea(){
super.display_color();
System.out.printf("Area (int radius): %.2f\n",(3.14*radius*radius));
} 
}

class Shapes{
public static void main(String args[]){

Circle c = new Circle();
c.calculateArea();
}
}