package Maven.Selenium.testing;

public class CodingProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str ="a2b3c4";
		
		for (int i=0;i<str.length();i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				
				System.out.println(str.charAt(i));
			}
			
			else {
				
				int a = Character.getNumericValue(str.charAt(i));
				
				for(int j = 0;j<a;j++) {
					
					System.out.println(str.charAt(i-1));
				}
			}
			
		}

	}

}
