package Maven.Selenium.testing;

import java.util.Arrays;

public class PivotreeLearningSession8_Strings {

	
	public static void main(String[] args) {
		
		
		System.out.println("===========================Example 1================================");
		
		//Example 1
		
		String s = "Welcome";
		//or
		String t = new String("Welcome");
		
		System.out.println(t);
		
		int m = t.length();
		System.out.println("Length of t is " +m);
		
	//================================================================================	
		
		System.out.println("===========================Example 2================================");
		
		
		
		
		//Example 2
		
		
		//concat
	
		String str1 = "Welcome ";
		String str2 = "to java ";
		String str3 = "automation";
		
		System.out.println("Testing concat1 : "+str1+str2);
		//or
		System.out.println("Testing concat2 : "+str1.concat(str2));
		//concat 3 strings
		System.out.println("Testing concat3 : "+str1.concat(str2).concat(str3));
		//or
		System.out.println("Testing concat4 :"+"Welcome ".concat("to Java"));
		
		
		//================================================================================	
		
				System.out.println("===========================Example 3================================");
		
		
		//Example 3
		
		//Trim right and left
		
		
		String a= "   Welcome   ";
		System.out.println("Testing trim1.After Trimming :"+s.trim());
		System.out.println("Testing trim1.After Trimming Length is :"+s.trim().length());
		
		
		//================================================================================	
		
				System.out.println("===========================Example 4================================");
		
		//Example 4
		
		//chatAT : returns character based on index
		
		String b = "Welcome";
		
		System.out.println("Checking charAt method : The 2nd index character is "+b.charAt(2));
		
		//================================================================================	
		
				System.out.println("===========================Example 5================================");
		
		
		//Example 5
		
		//contains method.Always returns boolean.Either True or false.Case sensitive
		
		String c  = "Welcome";
		
		
		System.out.println("Checking Contains method " +s.contains("Wel"));
		
		//================================================================================	
		
				System.out.println("===========================Example 6================================");
		
		//Example 6
		//equals and equalsIgnore case.used for comparing strings.case sensitive
		
		String d = "Welcome";
		String e = "welcome";
		
		
		System.out.println("Checking Equals method 1  " +d.equals(e)); //returns False
		System.out.println("Checking Equals method 2  " +d.equalsIgnoreCase(e)); //returns True
		
		
		//================================================================================	
		
				System.out.println("===========================Example 7================================");
		
		//Example 7
		//Replace : replacses single or multiple characters
		
		String f = "Welcome to selenium Java selenium Python selenium c#";
		System.out.println(f.replace("e", "X"));
		System.out.println(f.replace("selenium", "Playright"));
		
		
		//================================================================================	
		
				System.out.println("===========================Example 8================================");
		
		//Example 8
		
		String g = "Welcome";
		System.out.println(g.substring(1,5));
		
		//================================================================================	
		
				System.out.println("===========================Example 9================================");
		
		//Example 9
		//Upper and lower case and lower case
		String h = "welcome";
		System.out.println("Changing to upper case : "+g.toUpperCase());
		
		
		//================================================================================	
		
				System.out.println("===========================Example 10================================");
		
		//Example 10
		//split() :  split based on delimeters such as @ and comma and so on
		//Note : we cannot use following characters in split as delimeters : *  %  &  (  ) 
		
		String i = "abc@gmail.com";
		
		//better behavior than substring
		String i1 [] = i.split("@");
		
		System.out.println("Checking split.Part 1 of string is : "+i1[0] +" and part 2 of string is " +i1[1]);
		
		
		
		//================================================================================	
		
				System.out.println("===========================Example 11================================");
		
		//Write an example to convert $15,20,55 to 152055
				
				String amount = "$15,20,55";
				
				System.out.println("Example 11 for replaces : "+amount.replace("$", ",").replace(",", ""));
				
				
				
				
				//================================================================================	
				
						System.out.println("===========================Example 12================================");
				
				//Seperate out  s= "abc,123@xyz" to abc , 123, xyz
				
				
						String j = "abc,123@xyz";
						
						String arr [] = j.split(",");
						System.out.println(Arrays.toString(arr));
						
						String arr1 [] = arr[1].split("@");
						System.out.println(Arrays.toString(arr1));
						
						System.out.println("Final result after splittingabc,123@xyz is below");
						
						System.out.println(arr[0]+" "+arr1[0]+" "+arr1[1]);
						
						
						//================================================================================	
						
						System.out.println("===========================Example 13================================");
				
						
						//Even though contains is case sensitive, write a line to
						//check character irrespective of whether its uppercase or lower case
				
						
						String name = "John kennedy";
						System.out.println(name.replace('J', 'j').contains("john")); //now will return true
						//or
						System.out.println(name.toLowerCase().contains("john")); //now will return true
						
						
						
	}//This is closing bracket for public static void main
	
	
	
	
}
