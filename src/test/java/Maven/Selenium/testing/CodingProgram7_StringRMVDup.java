package Maven.Selenium.testing;

public class CodingProgram7_StringRMVDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABCABCABC";
		
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			
			String ch = ""+str.charAt(i);
			if(result.contains(ch)) {
				
				continue;
			}
			
			result+=ch;
			
			
		}
		
		System.out.println(result);

	}

}
