package Demo;

public class NewCarDemo {

	public static void main(String[] args) {
		// Creating object
		
		//First object
		NewCar myCar = new NewCar("Toyota", "Preius", 2024, "White", 2.6, 55, 200, "Petrol");
		myCar.displayCarSpecification();
		
		System.out.println();
		//Second object
		NewCar myCar1 = new NewCar("Merc", "GLB", 2024, "White",3, 70, 280, "Desiel");
		myCar1.displayCarSpecification();

	}

}
