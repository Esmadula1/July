package StaticVariables;
import java.util.Scanner;
public class CarDetails {

	public static void main(String[] args) {
		// here getting the using to input data about a car and then the program will display the entered data back to the user.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the maximum speed of the car: ");
		int maxSpeed = scanner.nextInt();
		
		
		System.out.println("Enter the price of the car ");
		 double price = scanner.nextDouble();
		 
		 
		 System.out.println("Enter the fuelType ");
		 String fuelType = scanner.next();
		 
		 System.out.println("\nCar Details");
		 System.out.println("----------------");
		 
		 System.out.println("Maximum Speed: "+maxSpeed +"mph");
		 
		 
		 System.out.println("Price: £"+price);
		 
		 System.out.println("FuelType: "+fuelType);
		 
		 if(maxSpeed < 140 && fuelType == "Deisel" && price < 2000) {
			 System.out.println("Not a fast car");
		 }else if(maxSpeed >150 && fuelType =="Petroll" && price > 30000) {
			 System.out.println("It's a supper car");
		 }
		
		scanner.close();
	
		
	}
	

}
