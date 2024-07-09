package InstanceVariables;

public class AccountDetails {
	public int accountNumber;
	public int sortCode;
	public String accountName;
	public String bank;
	
	public void assign(int accountNumber,int sortCode, String accountName,String bank) {
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.accountName = accountName;
		this.bank = bank;
		
	}
	
	public void display() {
		System.out.println("Your Account Number is: "+accountNumber);
		if(accountNumber != 10) {
			System.out.println("Invalid Acount Number");
		}
		System.out.println("Your Sort Code is: "+sortCode);
		if(sortCode != 6) {
			System.out.println("Invalid Sort Code!");
		}
		System.out.println("Your Acount Name is: "+accountName);
		
		System.out.println("Your Bank is: "+bank);
	}

}
