package Maven.Selenium.testing;

public class PivotreeLearnSession12_constructor_BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cnstructor is invoked by just creating an object
		
		PivotreeLearnSession12_constructor_Box B = new PivotreeLearnSession12_constructor_Box();
		
		//This will invoke default constructor
		
		
		System.out.println(B.volume());
		
		
		//to invoke 2nd constructor with parameters, create object of method with parameters
		
		PivotreeLearnSession12_constructor_Box B1 = new PivotreeLearnSession12_constructor_Box(10.5,11.5,12.5);

		System.out.println(B1.volume());
	}

}
