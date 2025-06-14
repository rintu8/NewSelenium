package Maven.Selenium.testing;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10; //primite data
		Integer num1 = a; //this is auto-boxing

		int num2 = num1;  //un-boxing
		
		
		//try boxing/unboxing on integer saved as  string
		
		String str = "12";
		int num3 = Integer.parseInt(str);
		System.out.println(num3);
		
	}

}
