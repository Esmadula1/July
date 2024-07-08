package Demo;

public class House {
	public String address;
	public int numBedrooms;
	public int numBathrooms;
	public double totalSquareFootage;
	
	public House(String address, int numBedrooms, int numBathrooms, double totalSquareFootage) {
		this.address = address;
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.totalSquareFootage = totalSquareFootage;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	
	public void setBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	
	}
	
	public void setSquareFootage(double totalSquareFootage) {
		this.totalSquareFootage = totalSquareFootage;
	}
	
	public void displayHouseDetails() {
		System.out.println("House Address: "+address);
		System.out.println("Number of Bedrooms "+numBedrooms);
		System.out.println("Number of Bathrooms "+numBathrooms);
		System.out.println("Total Square Footage "+totalSquareFootage + " sq.ft");
		
		if(numBathrooms == 0) {
			System.out.println("The house has no bathroom!");
		}else if(numBathrooms >2) {
			System.out.println("That's a great house");
		}
	}

}
