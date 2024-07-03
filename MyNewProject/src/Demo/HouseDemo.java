package Demo;

public class HouseDemo {

	public static void main(String[] args) {
		// Creating object
		
		//first object
		House myHouse = new House ("123 Main Street",3,3,2000.0);
		myHouse.displayHouseDetails();
		
		System.out.println();
		//second object
		
		House myHouse1 = new House("1 Hight Street",5,0,1000);
		myHouse1.displayHouseDetails();
		
		System.out.println();
		
		//object 3
		
		House myHouse2 = new House("5 Alabert Road", 4, 0, 100);
		myHouse2.displayHouseDetails();

	}

}
