/* Q WAP to check number is Strong number or not.
Strong number : 145  factorial of 5:120 , 4:24 ,1:1  120+24+1=145
 */
import java.util.*;

class QStrongN{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int n = sc.nextInt();
int sum=0;
int original = n;

while(n>0){
int last = n%10;
int fact=1;
for(int i=1; i<=last; i++){
fact *= i;
}
sum += fact;
n=n/10;
}

if(sum == original){
System.out.println(sum + " is Strong number");
}
else{
System.out.println("Number is not a Strong number");
}

}
}