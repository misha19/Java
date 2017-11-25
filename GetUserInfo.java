package javaprog;

import java.util.Scanner;
public class GetUserInfo {

	
	public static void main(String[] args) {
		
		int age;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		
		System.out.println("Please enter your age: ");
		age = sc.nextInt(); 
		//print out the name and age
		System.out.println("Your name is: " + name + " And your are : " +age+ " years old. ");
		 
	}

}
