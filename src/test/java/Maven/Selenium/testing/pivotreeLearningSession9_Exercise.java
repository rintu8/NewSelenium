package Maven.Selenium.testing;

import java.util.Scanner;

public class pivotreeLearningSession9_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("===========================Pivotree Assignment :================================");
		
		System.out.println("\r\n"
				+ "			You are building a basic password encryption feature for a login system in a mobile app. For demonstration purposes, the system simply reverses \r\n"
				+ "			the entered password before storing it, simulating a basic encoding method");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the character to convert to password");
		String pwdCandidate = scanner.next();
		
		String pwd = "";

		for(int i=pwdCandidate.length()-1;i>=0;i--) {
			
			pwd = pwd+pwdCandidate.charAt(i);
		}
		
		
		System.out.println("The password for the chjosen string is : " +pwd);
		
		

	}

}
