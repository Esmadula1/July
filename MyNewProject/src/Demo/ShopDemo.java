package Demo;

public class ShopDemo {

	public static void main(String[] args) {
		// Creating object
		Shop shop1 = new Shop("Lidle", "Tonbridge", "Grossories", 20);
		shop1.displayShopDetails();
		
		System.out.println();
		//object2
		
		Shop shop2 = new Shop("Sainsbury", "Maidstone", "Everything", 5);
		shop2.displayShopDetails();
		
		System.out.println();
		
		//object3
		
		Shop shop3 = new Shop("Morrisons", "Larkfield", "Everything", 30);
		shop3.displayShopDetails();
		
		

	}

}
