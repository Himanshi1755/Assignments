import java.util.*;
class Sports{
Scanner sc;
    private int over;
    private int ball;
    private int runs;
    private String batsman;
    private String bowler;
    private String nonStriker;

    Sports() {
        this.over = 0;
        this.ball = 0;
        this.runs = 0;
        this.batsman = "Unknown";
        this.bowler = "Unknown";
        this.nonStriker = "Unknown";
    }

 Sports(int over, int ball, int runs, String batsman, String bowler, String nonStriker) {
sc = new Scanner(System.in);
           
System.out.print("Over : "  );
this.over = Integer.parseInt(sc.nextLine());
System.out.print("Balls : ");
 this.ball = Integer.parseInt(sc.nextLine());
System.out.print("Runs : " );
 this.runs = Integer.parseInt(sc.nextLine());
System.out.print("Batsman : " );
this.batsman = sc.nextLine();
System.out.print("Bowler : ");
 this.bowler = sc.nextLine();
System.out.print("Non Stricker : ");
 this.nonStriker = sc.nextLine();
    }


  void setOver(int over) {
        this.over = over;
    }

   void setBall(int ball) {
        this.ball = ball;
    }

     void setRuns(int runs) {
        this.runs = runs;
    }

    void setBatsman(String batsman) {
        this.batsman = batsman;
    }

 void setBowler(String bowler) {
        this.bowler = bowler;
    }

   void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

   
    void displaySportsDetails() {
        System.out.println();
        System.out.println("Over: " + over);
        System.out.println("Ball: " + ball);
        System.out.println("Runs: " + runs);
        System.out.println("Batsman: " + batsman);
        System.out.println("Bowler: " + bowler);
        System.out.println("Non Striker: " + nonStriker);
    }
}

public class Cricket {
    public static void main(String[] args) {
        
        Sports s1 = new Sports();
        System.out.println("Default Constructor Output:");
        s1.displaySportsDetails();
        
         s1.setOver(1);
         s1.setBall(1);
         s1.setRuns(4);
         s1.setBatsman("Dhoni");
         s1.setBowler("Dale Steyn");
         s1.setNonStriker("Suresh Raina");
        
     //   System.out.println("\nUpdated Sports Details:");
         s1.displaySportsDetails();
        
      
        Sports  s2 = new Sports(0,0,0,"","","");
        System.out.println("\nParameterized Constructor Output:");
        s2.displaySportsDetails();
    }
}
