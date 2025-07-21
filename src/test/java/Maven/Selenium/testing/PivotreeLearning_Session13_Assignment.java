package Maven.Selenium.testing;

import java.util.Random;


/*

You are building a School Admission System where:

Every time a student is admitted, they get a unique admission number.

The total number of students admitted so far should be tracked.

This count of total students should be shared across all student objects, which makes it
 a perfect use case for a static variable.

A static method will be used to display the total number of students admitted so far 
— this method can be called without creating an object."	
 * 
 * 
 * */
 

public class PivotreeLearning_Session13_Assignment {

	
	
	
	static int student_count=0;
	static int admission_sequence = 1;
	
	
	
	static public void  GenerateAdmissionNumber() {
		
		
		
		for(int i=0;i<10;i++) {
			Random random = new Random();
			int randomInt = random.nextInt();
			System.out.println("For admission " +admission_sequence+ ", the admission number is " +randomInt);
			admission_sequence=admission_sequence+1;
			student_count=student_count+1;
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//access the method and variable without object
		
		
		GenerateAdmissionNumber();
		System.out.println("The total student count is " +student_count);
		

	}

}
