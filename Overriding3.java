
/*Assignment 3.
Create a parent class Bank with a method getInterestRate() that returns 0.
Create subclasses:
SBI that overrides getInterestRate() to return 5.
ICICI that overrides getInterestRate() to return 6.
Axis that overrides getInterestRate() to return 7.
In the Main class, demonstrate method overriding by calling getInterestRate() on different bank objects. */
import java.util.*;

class Bank {

    int getInterestRate() {

        return 0;
    }
}

class SBI extends Bank {

    int getInterestRate() {

        return 5;
    }
}

class ICICI extends Bank {

    int getInterestRate() {

        return 6;
    }
}

class Axis extends Bank {

    int getInterestRate() {

        return 7;
    }
}

public class Overriding3 {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        System.out.println("SBI IR :" + b1.getInterestRate());
        b1 = new ICICI();
        System.out.println("ICICI IR : " + b1.getInterestRate());
        b1 = new Axis();
        System.out.println("Axis IR : " + b1.getInterestRate());

        /*
         * Bank arr[] = new Bank[3];
         * arr[0] = b1;
         * arr[1] = b1;
         * arr[2] = b1;
         */

        Bank arr[] = new Bank[3];
        arr[0] = new SBI();
        arr[1] = new ICICI();
        arr[2] = new Axis();

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i].speed());
            System.out.println(arr[i].getInterestRate());
        }
    }

}
