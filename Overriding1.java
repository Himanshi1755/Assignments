/*Shape Area Calculation
Create a parent class Shape with a method calculateArea() that prints "Area calculation not defined for Shape."
Create subclasses:
Circle that overrides calculateArea() to calculate and print the area of a circle.
Rectangle that overrides calculateArea() to calculate and print the area of a rectangle.
Write a Main class to demonstrate polymorphism using an array of Shape objects. */

import java.util.*;

class Shape {
    void calculateArea() {
        System.out.println("Area calculation not defined for Shape.");
    }
}

class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    void calculateArea() {
        System.out.printf("Area of circle : %.2f\n", (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle : " + (l * b));
    }
}

class Overriding1 {
    public static void main(String args[]) {

        Shape c = new Circle(4);
        c.calculateArea();

        c = new Rectangle(10, 20);
        c.calculateArea();

        Shape arr[] = new Shape[2];
        arr[0] = new Circle(6);
        arr[1] = new Rectangle(15, 60);
        for (Shape s : arr) {
            s.calculateArea();
        }
    }
}