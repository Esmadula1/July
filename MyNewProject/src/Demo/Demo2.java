package Demo;

public class Demo2 {

	public static void main(String[] args) {
		// Creating object
		
		//First object
		Student std = new Student();
		std.assign("Esmadula", 21, 'A', "07876544322", 101);
		std.display();
		
		System.out.println();
		
		//Second object
		Student std1 = new Student();
		std1.assign("Craig", 23, 'B', "07865432344",102 );
		std1.display();
		
		System.out.println();
		
		//Third object
		
		Student std2 = new Student();
		std2.assign("John", 24, 'E', "079654345443", 103);
		std2.display();
		
		System.out.println();
		
		//Fourth object
		Student std3 = new Student();
		std3.assign("David", 25, 'F', "07865432663", 104);
		std.display();
		
		System.out.println();
		
		//Fifth object
		
		Student std4 = new Student();
		std4.assign("Mark", 25, 'E', "07864766344", 106);
		std4.display();
		
		
		
		

	}

}
