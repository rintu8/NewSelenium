package Maven.Selenium.testing;

public class PivotreeLearning_Session12_Encap_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object of the child class where i have declared the variables for encapsulation
		
		PivotreeLearning_Session12_Encap Acc = new PivotreeLearning_Session12_Encap();
		
		//Note that since the variables  there are private, we cant access usng object.So we create getters and setters

		//in the child class
		
		
		//Now access the methods from child class to set and get values
		
		Acc.setAccNo(105);
		System.out.println(Acc.getAccNO());
		
		
		Acc.setAccName("Test1");
		System.out.println(Acc.getAccName());
		
		Acc.setAmount(1000);
		System.out.println(Acc.getAmount());
		
		
		//So now you see, in the child class, i created the private variables and the getters/Setters.
		//And from here in main class.I access the getters/Setters and assign values as well as set the values
	}

}
