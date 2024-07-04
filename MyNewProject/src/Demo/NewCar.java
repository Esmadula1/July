package Demo;

public class NewCar {
	private String make;
	private String model;
	private int year;
	private String color;
	private double engineSize;
	private double milesPerGallon;
	private int maxSpeed;
	private String fuelType;
	
	public NewCar(String make,String model, int year, String color, double engineSize,double milesPerGallon,int maxSpeed,String fuelType) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.engineSize = engineSize;
		this.milesPerGallon = milesPerGallon;
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public void setMilesPerGallon(double milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void displayCarSpecification() {
		System.out.println("Car Make : "+make);
		System.out.println("Car Model : "+model);
		System.out.println("Car Year : "+year);
		System.out.println("Color : "+color);
		System.out.println("Engine Size : "+engineSize);
		System.out.println("Fuel Type : "+fuelType);
		System.out.println("Max Speed : "+maxSpeed + " mph");
		System.out.println("Fuel Cost : " + milesPerGallon + " mpg");
		if(milesPerGallon < 50) {
			System.out.println("This car not very economical!");
		}else {
			System.out.println("Great joice!");
		} 
		if(fuelType == "Desiel") {
			System.out.println("This car is not examp!");
		}
		
	}
	

}
