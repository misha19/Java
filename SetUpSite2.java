package javaprog;

import java.util.Scanner;

public class SetUpSite2 {

	public static void main(String[] args) {
		
		final int FOUNDED_YEAR = 1844;
		int currentYear;
		int age;
		Scanner sc = new Scanner(System.in);
		
		statementOfPhilosophy ();
		
		System.out.println("Enter the current year:  ");
		currentYear = sc.nextInt();
		age = calculateAge(FOUNDED_YEAR,currentYear);
		
		System.out.println("founded in  "+ FOUNDED_YEAR);
		System.out.println("serving you for " + age + "years");
		
	}
	
	
	private static int calculateAge(int originYear, int currDate) {
		int years;
		years = currDate-originYear; 
		return years ; 
	}


	public static void statementOfPhilosophy (){
		System.out.println("Event Hanlers Incorporated is ");
		System.out.println("dedicated to bring you ");
		System.out.println("the moments of pleasure. ");
		
		
	}

}
