package day05.practice;

class Account {
	String accNo;
	double balance;
	
	Account(String accNo,double balance) throws Exception{
		if( accNo.trim().equals(null) || balance <= 0) {
			
			throw new Exception("The value cannot be nul or less than 0");
			
			
		}
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

//Create an implementation of the below Interface
 interface ATM {
	boolean deposit(Account account, double amount);

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance();
}

class AxisATM implements ATM {

	private double bal;

	@Override
	public boolean deposit(Account account, double amount) {

		account.setBalance(account.getBalance() + amount);

		return true;

	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {

		if (account.getBalance() < 5000) {
			throw new Exception("Your balance is below 5000");
		} else {

			int charge = 5;
			account.setBalance((account.getBalance() - amount) - charge);
			bal = account.getBalance();
			return true;
		}
	}

	@Override
	public double getBalance() {
		return bal;
	}

}

class IciciATM implements ATM {
	
	private double bal;

	@Override
	public boolean deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
		return true; 
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		
		if (account.getBalance() < 10000) {
			throw new Exception("Your balance is below 10000");
		} else {
			byte charge = 10;
			account.setBalance((account.getBalance() - amount) - charge);
			
			return true;
		}

	}

	@Override
	public double getBalance() {
		return 0;
	}

}


public class TestATM {
	public static void main(String[] args) {
		
		try {
			
			Account account = new Account("123456789",20000.00);
			ATM axis = new AxisATM();
			
			System.out.println(axis.deposit(account, 5000));
			System.out.println(axis.withdraw(account, 2000));
			System.out.println(axis.getBalance());
			
			
			ATM icic = new IciciATM();
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}