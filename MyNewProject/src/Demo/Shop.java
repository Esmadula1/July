package Demo;

public class Shop {
	private String name;
	private String location;
	private String productSold;
	private int numEmployees;
	
	public Shop(String name, String location, String productSold, int numEmployees) {
		this.name = name;
		this.location = location;
		this.productSold = productSold;
		this.numEmployees = numEmployees;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setProductSold(String productSold) {
		this.productSold = productSold;
	}
	
	public void setEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	
	public void displayShopDetails() {
		System.out.println("Shop Name: "+ name);
		System.out.println("Shop Location "+ location);
		System.out.println("Product Sold "+productSold);
		System.out.println("Number of Employees "+numEmployees);
		if(numEmployees <=10) {
			System.out.println("This is only small shop");
		}else {
			System.out.println("It's a supper market");
		}
	}

}
