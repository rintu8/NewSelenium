package Maven.Selenium.testing;

public class CodingProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome To Automation";
		
		int lower = 0;
		int upper = 0;
		
		for (int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>=65 && ch<=90) {
				
				upper++;
				
				
			}
			
			else {
				
				lower++;
			}
		}
		
		System.out.println("The number of lower characters is " +lower);
		System.out.println("The number of upper characters is " +upper);

	}

}
