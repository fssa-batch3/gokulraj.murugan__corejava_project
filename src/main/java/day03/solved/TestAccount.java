package day03.solved;

class Account { // create a class
	 
	
	 // Declare the variables
    public String accNo;
 
    public String name;
 
    public double balance;
 
     
 // Creating a Constructor which accepts all the attributes: Constructor
 	// Overloading
    public Account(String accNo, String name, double balance) {
    	
    	// assign the values to the variable
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
     
 
}


public class TestAccount { // create a class
	 
    public static void main(String[] args) { // main method starts
         
        //create Account
        Account acct1 = new Account("A101", "Naresh" , 1000 );
        System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance); // output
         
         
        //create Account
        Account acct2 = new Account("A102","Arun", 1000);
        System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance); // output
    } // main method ends
 
} 