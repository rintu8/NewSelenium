package Maven.Selenium.testing;

import java.util.Scanner;

public class PivotreeLearningSession6_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sales[] = new int[7];
		
		String Days[] = {"Monday","Tuesday","Wednesday","THursday","Friday","Saturday","Sunday"};
		
		String Day1 = "";
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter sales count for Monday");
		 sales[0]= scanner.nextInt();
		 System.out.println("Enter sales count for Tuesday");
		 sales[1]= scanner.nextInt();
		 System.out.println("Enter sales count for WEdnesday");
		 sales[2]= scanner.nextInt();
		 System.out.println("Enter sales count for Thursday");
		 sales[3]= scanner.nextInt();
		 System.out.println("Enter sales count for Friday");
		 sales[4]= scanner.nextInt();
		 System.out.println("Enter sales count for Saturday");
		 sales[5]= scanner.nextInt();
		 System.out.println("Enter sales count for Sunday");
		 sales[6]= scanner.nextInt();
		 
		 int Highsale = 0 ;

		 
		 for(int i=0;i<=sales.length-1;i++) {
			
		
			
				 	if(sales[i]>Highsale) {
	
			 		Highsale = sales[i];
			 		
			 		if(sales[i]==Highsale) {
			 			
			 			   Day1 = Days[i];
			 			
			 		}
			 		
			 		
			 		
			 		
				 	}
			 		
			 }
			 	 
			 	
			 	
				 
				 
		 
		 System.out.println("The highest sales was for " +Highsale + " on Day " +Day1 );
		
	}
	
	
	

}
