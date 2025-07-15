package Maven.Selenium.testing;

public class PivotreeLearningSession10_PracticeMain {
	

	// This is the main class to execute variables and methods from class "CodingOOPS_Practice"
	
	//We are able to access the class "CodingOOPS_Practice" from here because the 
	//package "Maven.Selenium.testing" is same
	
	
	//Even if the package is different, we can still access by importing package in main class, 
	//for example writing ==>import Maven.Selenium.testing
	
	/*
	
	Below is the heirarchy for projects,packages and classes
	
	Project _____Package1________Class 1
	       |             |
	       |             |________Class 2
	       |
	       |
	       |
	       |_____Package2__________Class 1
	                    |
	                    |__________Class 2
	                    
	                    
	                    */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 PivotreeLearningSession10_Practice emp1 = new  PivotreeLearningSession10_Practice();
		
		emp1.eid=101;
		emp1.ename="Test1";
		emp1.job="Teacher";
		emp1.sal=1000;
		
		
		emp1.display();

	}

}
