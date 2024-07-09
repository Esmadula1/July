package InstanceVariables;

public class BankAccount {

	public static void main(String[] args) {
		// Creating new object
		System.out.println("Bank Acount Details"+"\n"+"______________");
		//System.out.println("__________");
		AccountDetails firstAccount =new AccountDetails();
		firstAccount.assign(342255552, 22336, "Esmadula", "Nat West");
		
		firstAccount.display();
		
		System.out.println();
		
		//Second object
		
		System.out.println("Bank Acount Details");
		System.out.println("__________");
		
		AccountDetails secondAccount = new AccountDetails();
		secondAccount.assign(335588991, 213456, "Hasani", "Halifax");
		secondAccount.display();

	}

}
