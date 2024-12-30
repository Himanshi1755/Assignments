// Q1. Write a Program to pass individual elements of array to  method and display it. 
import java.util.*;
/*
class Ques{
 
public static void main(String [] args){

int arr[] = new int[3];
arr[0]=10;
arr[1]=30;
arr[2] = 67;
display(arr);
}
public static void display(int arr2[]){

for (int i=0; i<arr2.length; i++){

System.out.println(arr2[i]);
}
}
}
*/

//  Q2. Write a Program to pass Entire array to the method and display it. 
class Ques{
 
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array : ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the Elements: ");
for(int i=0; i<arr.length ; i++){
arr[i]=sc.nextInt();
}
display(arr);

}
public static void display(int arr[]){
System.out.println("Elements are : ");
for (int i=0; i<arr.length; i++){

System.out.println(arr[i]);
}
}
}

