package Maven.Selenium.testing;

import java.math.BigDecimal;
import java.util.Scanner;

public class PivotreeLearningSession4_IfElse {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("What is the runtime fior the runner1 in seconds");
		
		double var1 = scanner.nextDouble();
		
		System.out.println("What is the runtime fior the runner2 in seconds");
		
		double var2 = scanner.nextDouble();
		
		BigDecimal num1 = new BigDecimal(var1);
        BigDecimal num2 = new BigDecimal(var2);
        
        int comparisonResult = num1.compareTo(num2);
		
		if(comparisonResult > 0) {
			
			System.out.println("Runner 1 is th winner");
		}
		
		else if(comparisonResult < 0) {
			
			System.out.println("Runner 2 is th winner");
		}

		else if(comparisonResult==0) {
			System.out.println("Its a Tie");
			
		}
	}

}
