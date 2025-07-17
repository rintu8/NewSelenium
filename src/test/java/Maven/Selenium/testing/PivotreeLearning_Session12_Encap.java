package Maven.Selenium.testing;

public class PivotreeLearning_Session12_Encap {
	
	
	/*
	 * In encapsulation, we cannot access the variables ditectly.It can be accessed only through methods
	 
	
	It is wrapping up of data and methods to a single unit (class)
	
	By default we can access all variables by just creating object.
	
	First step: In order to prevent
	accessing the variable through object, we make the variable private.So outsite of the class, we cannot access
	the variables
	
	second step: Create 2 methods for rach variable.1 is to assign the data, and 2nd to read the data.(Setters and Getters)
	
	
	*/
	
	private int Accno;
	private String AccName;
	private double Amount;
	
	
	//Create Getters and Setters
	
	void setAccNo(int Accno1) {
		
		Accno=Accno1;
	}
	
	int getAccNO() {
		
		return Accno;
	}
	
void setAccName(String AccName1) {
		
	AccName=AccName1;
	}

String getAccName() {
	
	return AccName;
}

void setAmount(int Amount1) {
	
	Amount=Amount1;
	}
	
double getAmount() {
	
   return Amount;
}

}
