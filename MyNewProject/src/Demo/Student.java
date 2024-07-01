package Demo;

public class Student {
	//instance variables
		public String name;
		public int age;
		public char grade;
		public String number;
		public int idno;
		
		//instance method
		public void assign(String name, int age,char grade, String number,int idno) {
			this.name=name;
			this.age =age;
			this.grade=grade;
			this.number=number;
			this.idno=idno;	
		}
		
		//instance variable
		public void display() {
			System.out.println("Student name = "+name);
			System.out.println("Student age = "+age);
			System.out.println("Student grade = "+grade);
			System.out.println("Student number = "+number);
			System.out.println("Student Idno = "+idno);
		}

}
