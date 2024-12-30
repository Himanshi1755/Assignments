// Q4. Write a Program to pass Entire array to the method and return sum of all elements of this arary to main.
import java.util.*;
class Ques4{
 
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

int sum=0;
System.out.println("Elements are : ");
for (int i=0; i<arr.length; i++){
System.out.println(arr[i]);
sum += arr[i];
}
System.out.println("Sum of all elements of array : " + sum);
}
}