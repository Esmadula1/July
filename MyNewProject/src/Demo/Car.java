package Demo;

public class Car {
	//interior description
	private String interiorColor;
	private String interiorMaterial;
	private boolean leatherSeats;
	
	//exterior description
	private String exteriorColor;
	private String exteriorFinish;
	private boolean sunroof;
	
	public Car(String interiorColor, String interiorMaterial,boolean leatherSeats,String exteriorColor,String exteriorFinish,boolean sunroof) {
		this.interiorColor = interiorColor;
		this.interiorMaterial = interiorMaterial;
		this.leatherSeats = leatherSeats;
		
		this.exteriorColor = exteriorColor;
		this.exteriorFinish = exteriorFinish;
		this.sunroof = sunroof;
	}
	
	public void setInterior(String interiorColor, String interiorMaterial, boolean leatherSeats) {
		this.interiorColor = interiorColor;
		this.interiorMaterial = interiorMaterial;
		this.leatherSeats = leatherSeats;
		
	}
	
	public void setExterior(String exteriorColor,String exteriorFinish, boolean sunroof) {
		this.exteriorColor = exteriorColor;
		this.exteriorFinish = exteriorFinish;
		this.exteriorFinish = exteriorFinish;
		
	}
	
	public void displayInterior() {
		System.out.println("Interior Color: "+ interiorColor);
		System.out.println("Interior Material: "+interiorMaterial);
		System.out.println("Leather Seats: "+(leatherSeats ? "Yes" : "No"));
	}
	
	public void displayExterior() {
		System.out.println("Exterior Color: "+ exteriorColor);
		System.out.println("Exterior Finish: " + exteriorFinish);
		
		System.out.println("Sunroof: " +(sunroof ? "Yes" : "No"));
	}
	
	

}
