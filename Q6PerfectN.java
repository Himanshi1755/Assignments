/* Q6. Write a Program to Check given number is perfact or not . */
import java.util.*;
class Q6PerfectN{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num=sc.nextInt();
int sum=0;
for(int i=1; i<num; i++){
if(num%i == 0){
System.out.print(i + " " );
sum += i;
}
}
System.out.println();
if(sum == num){
System.out.println("It is Perfect number !!");
}
else{
System.out.println("It is not Perfect number !!");
}


}
}