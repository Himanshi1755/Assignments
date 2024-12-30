import java.util.Scanner;
class Person {
    private String f_Name;
    private String l_Name;

       public Person(String f_Name, String l_Name) {
        this.f_Name = f_Name;
        this.l_Name = l_Name;
    }
    
      public void setFirstName(String f_Name) {
        this.f_Name = f_Name;
    }

      public String getFirstName() {
        return f_Name;
    }

      public void setLastName(String lastName) {
        this.l_Name = l_Name;
    }

        public String getLastName() {
        return l_Name;
    }


}

class Employee extends Person {
private int emp_id;
private String job_title;


      public Employee(String f_Name, String l_Name, int emp_id, String job_title) {
        super(f_Name, l_Name);
        this.emp_id = emp_id;
        this.job_title = job_title;
    }
    public void set_emp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public int get_emp_id() {
        return emp_id;
    }
    public void setjob_title(String job_title) {
        this.job_title = job_title;
    }
    public String getjob_title() {
        return job_title;
    }

void display(){
        System.out.println();
        System.out.println("---- Employee details ----");
        System.out.println("Name: " + getFirstName() + " " + getLastName() + ", " + getjob_title());
        System.out.println("Employee ID: " + get_emp_id());
}

    
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Enter Employee Details -");
        System.out.print("First Name : ");
        String f_Name = sc.nextLine();
        System.out.print("last Name:");         
        String l_Name = sc.nextLine(); 
        System.out.print("Emp_id :"); 
        int emp_id = Integer.parseInt(sc.nextLine());
        System.out.print("Job_Title :");
        String job_title = sc.nextLine();   
               
Employee emp = new Employee(f_Name, l_Name, emp_id, job_title);
System.out.println();
        System.out.println("---- Employee details ----");
        System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName() + ", " + emp.getjob_title());
        System.out.println("Employee ID: " + emp.get_emp_id());

Employee emp1 = new Employee("Himanshi" , "Joshi" , 101 , "Developer ");
emp1.display();
Employee e2 = new Employee(f_Name, l_Name, emp_id, job_title);
e2.setFirstName("Ansh");
e2.setLastName("Dave");
e2.set_emp_id(101);
e2.setjob_title("Doctor");
e2.display();

}
}

/*
D:\Infobeans\Assignment>java Main1
- Enter Employee Deatils -
First Name : John
last Name:Methew
Emp_id :120948
Job_Title :Developer

---- Employee details ----
Name: John Methew, Developer
Employee ID: 120948

--------------
D:\Infobeans\Assignment>java Main1
- Enter Employee Details -
First Name : AAA
last Name:JJJJ
Emp_id :111
Job_Title :TEACHER

---- Employee details ----
Name: AAA JJJJ, TEACHER
Employee ID: 111

---- Employee details ----
Name: Himanshi Joshi, Developer
Employee ID: 101

---- Employee details ----
Name: Ansh JJJJ, Doctor
Employee ID: 101
*/
