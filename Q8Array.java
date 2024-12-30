/* Q8. Write a Program to find Max and Min elements in 2D array. */
import java.util.*;
class Q8Array{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the row : ");
int n = sc.nextInt();
System.out.println("Enter the col : ");
int n1 = sc.nextInt();
int max=0;


int arr1[][] = new int[n][n1];

System.out.println("Enter elements of arr1 : ");
for(int i=0; i<arr1.length; i++){
for(int j=0; j<arr1.length; j++){
arr1[i][j] = sc.nextInt();
}
}
int min=arr1[0][0];

for(int i=0; i<arr1.length; i++){
for(int j=0; j<arr1.length; j++){
if(arr1[i][j] > max){
max = arr1[i][j];
}
if(arr1[i][j] < min){
min = arr1[i][j];
}
}
}

System.out.println("Maximum : " + max);
System.out.println("Minimum : " + min);

}
}