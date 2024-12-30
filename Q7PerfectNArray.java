/* Q7. Write a Program to read a array from user and count how many perfect number in there in that array. */
import java.util.*;
class Q7PerfectNArray{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Size of Array :");
int n=sc.nextInt();

int arr[] = new int[n];
int count=0;

System.out.println("Enter elements of arr : ");
for(int i=0; i<arr.length; i++){
arr[i] = sc.nextInt();
}

for(int i=0; i<arr.length; i++){
int sum=0;
int num =arr[i];
for (int j=1; j<num; j++){
if(arr[i]%j == 0){
//System.out.print(arr[i] + " " );
sum += j;
}
}
if(sum == arr[i]){
count++;
System.out.println("Perfect number is " + arr[i] + " at position " + (i+1));
}
}
System.out.println("Count : " + count);

}
}