package Maven.Selenium.testing;

import java.util.Scanner;

public class Pivotree_Learning_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number of Items");
		
		int ItemQuantity = scanner.nextInt();
		
		System.out.println("Please enter cost of each Item");
		
		double Cost = scanner.nextDouble();
		
		//To apply discount
		
		double TotalCost = ItemQuantity*Cost;
		
		
		
		//To apply discount if price above 1000
		
		double discount = 0.10;
		double DiscounterPrice ;
		
	if (TotalCost>1000 && ItemQuantity>5) {
		
		DiscounterPrice= TotalCost*discount;
		
		System.out.println("You are eligible for a free gift" );
	}
	
	else if(ItemQuantity>5 || TotalCost<1000  ){
		System.out.println("The bill is not eligible for discount .The piice after fina; review is "+TotalCost );
		DiscounterPrice= TotalCost*discount;
		
	}
	
	else if(TotalCost>1000 ) {
		DiscounterPrice= TotalCost*discount;
		System.out.println("Since amount is greater than 1000, the price after discount is\" +DiscounterPrice " );
		
		
	}
	
	else {
		
		System.out.println("The final price is "+TotalCost );
	}
		

	}
	

}
