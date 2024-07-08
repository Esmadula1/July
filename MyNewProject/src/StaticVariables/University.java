package StaticVariables;

public class University {
	private static String faculty = "Engineering";
	private static double fee = 10000.0;
	private static String time = "Morning";
	
	public static void displayUniversityInfo() {
		System.out.println("Faculty "+faculty);
		System.out.println("Fee" +" £" +fee);
		System.out.println("Time "+time);
	}
	
}
