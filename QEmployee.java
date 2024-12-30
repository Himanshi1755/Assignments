/* 
 */
import java.util.*;
class Emp{

Scanner sc = new Scanner(System.in);

long emp_id ;
String emp_name;
long mobile_no ;
String address;
double salary;

void set_id(long emp_id){
this.emp_id=emp_id;
}
long get_id(){
return emp_id;
}

void set_name(String emp_name){
this.emp_name= emp_name;
}
String get_name(){
return emp_name;
}

void set_mobile(long mobile_no){
this.mobile_no= mobile_no;
}
long get_mobile(){
return mobile_no;
}

void set_address(String address){
this.address= address;
}
String get_address(){
return address;
}

void set_salary(double salary){
this.salary=salary;
}
double get_salary(){
return salary;
}

void display(){
System.out.println("--- Employee Details ---");
System.out.println("Emp_Id : " + get_id() );
System.out.println("Name   : " + get_name());
System.out.println("Moblie No.:" +get_mobile() );
System.out.println("Address   : " +get_address() );
System.out.println("Salary    :" + get_salary() );
}
}

class QEmployee{
public static void main(String args[]){
Emp e1 = new Emp();
e1.set_id(101);
e1.set_name("ABC");
e1.set_mobile(7645645677L);
e1.set_address("180 , Rajmolla");
e1.set_salary(60000);
e1.display();

}
}