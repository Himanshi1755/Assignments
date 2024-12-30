import java.util.Scanner;

class Area{
/*
void calculateCircumference(int m){
System.out.println((2*3.14*m));
}
void calculateCircumference(double n){
System.out.println((3.14*n*n));
}

void calculateArea(int m){
System.out.println((3.14*m*m));
}
void calculateArea(double n){
System.out.println((3.14*n*n));
}
*/

void calculateCircumference(int m){
System.out.printf("Circumference (int radius): %.2f\n", (2*3.14*m));
System.out.printf("Area (int radius): %.2f\n",(3.14*m*m));

}

void calculateArea(double n){
System.out.printf("Circumference (double radius): %.2f\n" , (2*3.14*n));
System.out.printf("Area (double radius): %.2f\n" , (3.14*n*n));
}


}

class Calculate{

public static void main(String args[]){
Area a1 = new Area();
a1.calculateCircumference(7);
a1.calculateArea(5.6);


}
}