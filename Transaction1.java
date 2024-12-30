/*2.
ONLINE TRANSACTION

Google Pay is a popular digital payment platform that allows users to send and receive money securely. It supports various types of transactions, including person-to-person payments, online purchases, and bill payments.

Implement the following classes to represent different types of transactions in Google Pay:

1. The Transaction class should have the following attributes:
 

2. The PeerToPeerTransaction class should inherit from Transaction and have an additional attribute:
 
 
  
3. The OnlinePurchaseTransaction class should inherit from Transaction and have an additional attribute:
 
 

4. The BillPaymentTransaction class should inherit from Transaction and have an additional attribute:
 
 

Write a Java program that demonstrates the usage of these classes. Create instances of PeerToPeerTransaction, OnlinePurchaseTransaction, and BillPaymentTransaction objects, and display their respective transaction information.

Your task is to implement the necessary classes and complete the main method to demonstrate the functionality. Provide the appropriate access modifiers, constructors, and methods as needed.
Input format :
•	The first input is an integer value representing the transaction ID.
•	The second input is a double value representing the amount.
•	The third input is a String value representing the recipient.
•	The fourth input is a String value representing the merchant.
•	The fifth input is a String value representing the bill type.
Output format :
The output should be in the following format:

Peer-to-Peer Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Recipient: <recipient>

Online Purchase Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Merchant: <merchant>

Bill Payment Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Bill Type: <billType>
*/
import java.util.Scanner;

class Transaction {
    private int trans_id;
    private double amt; 

        Transaction(int trans_id, double amt) {
        this.trans_id = trans_id;
        this.amt = amt;
    }
    
      public void set_trans_id(int trans_id) {
        this.trans_id = trans_id;
    }

      public int get_trans_id() {
        return trans_id;
    }

      public void set_amt(double amt) {
        this.amt = amt;
    }

        public double get_amt() {
        return amt;
    }


}

class PeerToPeerTransaction extends Transaction {
private String receipt;


      public PeerToPeerTransaction(int trans_id, double amt,  String receipt) {
        super(trans_id, amt);
        this.receipt=receipt;
    }
   
    public String get_receipt() {
        return receipt;
    }   
}

class OnlinePurchaseTransaction extends Transaction {
private String merchant;

 public OnlinePurchaseTransaction(int trans_id, double amt, String merchant) {
          super(trans_id, amt);
        this.merchant=merchant;
   }
    public String get_merchant() {
        return merchant;
    }   
}

class BillPaymentTransaction extends Transaction {
private String bill_type;


      public BillPaymentTransaction(int trans_id, double amt, String bill_type) {
          super(trans_id, amt);
          this.bill_type=bill_type;
    }
   
    public String get_bill_type() {
        return bill_type;
    }   
}   

public class Transaction1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Enter Details -");
        System.out.print("Transaction Id: ");
        int trans_id = Integer.parseInt(sc.nextLine());
        System.out.print("Amount  :");         
        double amt = Double.parseDouble(sc.nextLine());
 
System.out.print("Receipt :"); 
        String receipt = sc.nextLine();
 PeerToPeerTransaction p2 = new PeerToPeerTransaction(trans_id, amt, receipt);

        System.out.println("--  Peer-to-Peer Transaction --");
        System.out.println("Transaction ID  : " + p2.get_trans_id());
        System.out.println("Amount       : " + p2.get_amt());
        System.out.println("Recipient    : " + p2.get_receipt());


        System.out.print("\nMerchant :"); 
        String merchant = sc.nextLine();
OnlinePurchaseTransaction o1 = new OnlinePurchaseTransaction(trans_id, amt, merchant);
        System.out.println();
        System.out.println(" --Online Purchase Transaction --");
        System.out.println("Transaction ID: " + o1.get_trans_id());
        System.out.println("Amount   : " + o1.get_amt());
        System.out.println("Merchant : " + o1.get_merchant());

      System.out.print("\nBill Type  :");
        String bill_type = sc.nextLine(); 
BillPaymentTransaction b1= new BillPaymentTransaction(trans_id , amt , bill_type);
  
        System.out.println(); 
        System.out.println(" -- BillPaymentTransaction --");
        System.out.println("Transaction ID: " + b1.get_trans_id());
        System.out.println("Amount   : " + b1.get_amt());
        System.out.println("bill_type: " + b1.get_bill_type());

 
               
    }
}
/*



*/
