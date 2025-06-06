package Maven.Selenium.testing;

public class CodingProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "Java is object orinted language";
		
		//Just get length of string, then replace character with blank and get length again and minus the result
		
		int result = str.length()-str.replaceAll("a", "").length();
		
		System.out.println("The count of character: a is :" +result);
		

	}

}
