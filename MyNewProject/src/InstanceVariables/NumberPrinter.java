package InstanceVariables;

public class NumberPrinter {
	//Static method to print two numbers
	
	public static void printTwoNumbers(int num1,int num2) {
		System.out.println("The first number is: "+num1);
		System.out.println("The second number is: "+num2);
	}
	
	//Main method to test the static method
	
	public static void main(String[] args) {
		//Example usage
		
		printTwoNumbers(2, 2);
		printTwoNumbers(3, 3);
		printTwoNumbers(23, 0);
		
		
		
	}

}
