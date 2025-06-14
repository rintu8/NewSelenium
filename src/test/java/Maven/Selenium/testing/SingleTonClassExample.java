package Maven.Selenium.testing;

public class SingleTonClassExample {
	
	//https://www.youtube.com/watch?v=SqDbZOjW1uM
	
	//One way to ceate singleton class is by a way called eager initialization 
	//whener we initialize eagerly early itself
	
	private static SingleTonClassExample conObj = new SingleTonClassExample();
	
	
	//Now make this constructor private
	
	private SingleTonClassExample() {
		
		public static SingleTonClassExample getInstance() {
			
			return conObj;
			
		}
		
	}

}
