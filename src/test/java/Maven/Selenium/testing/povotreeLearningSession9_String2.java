package Maven.Selenium.testing;

import java.util.Arrays;
import java.util.Scanner;

public class povotreeLearningSession9_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("===========================Example 1 : Reverse String ================================");
		
		String s = "Welcome";
		String rev = "";
		
		for (int i=s.length()-1;i>=0;i--) {
			
			rev= rev+ s.charAt(i);
			
			
		}
		
		System.out.println(rev);
		
		
		//=================================================================================================
		
		System.out.println("===========================Example 2 : Reverse String ================================");
		
		
		String a = "Welcome";
		
		char b[] = a.toCharArray();
		String rev1 = "";
		
		for(int i=b.length-1;i>=0;i--) {
			
			rev1=rev1+b[i];
			
		}
		System.out.println(rev);
		
		
		

		//=================================================================================================
		
		System.out.println("===========================Example 3 by stringBuffer : Reverse String ================================");
		
		
		StringBuffer c = new StringBuffer("Welcome");
		
		System.out.println(c.reverse());
		
		
		
		//=================================================================================================
		
				System.out.println("===========================Example 4 by stringBulder : Reverse String ================================");
				
				StringBuilder d =  new StringBuilder("Welcome");
				
				System.out.println(d.reverse());
				
				
				
				//=================================================================================================
				
				System.out.println("===========================Example 4 Mutability/immutability ================================");
				 //mutable means we can change.Immutable means we cant change
				
				//String is immutable whereas stringbuffer and stringbuilder is mutable
				
				//Below is example for mutable
				int e[] = {20,10,40,30};
				System.out.println(Arrays.toString(e));
				Arrays.sort(e);
				System.out.println(Arrays.toString(e));
				//Note that sort method is changing the elements of array "e".So this method "sort" is changing
				//this array.So Arrays.sort is mutable
				
				//Below is example for immutable
				String f = "Welcome";
				f.concat("to India");
				System.out.println(s);
				//Note that s is still original value of "Welcome" , showing behavior of immutability
				
				
				// Another Example to show mutability  for StrinhBuffer/StringBuilder
				StringBuffer g = new StringBuffer("Welcome");
				System.out.println("Before append valie is " +g);
				g.append("To India");
				System.out.println("After append valie is " +g);
				//You can see that original string vale has been modified.Similarly its for StringBuilder
				
				
				
				//=================================================================================================
				
				System.out.println("===========================Example 5 String Comparison ================================");
				
				String h1="welcome";
				String h2="welcome";
				
				//case1
				System.out.println(h1==h2);
				System.out.println(h1.equals(h2));
				
				//In   above case1 , it returns True.
				
				//case2
				String h3 = new String("welcome");
				String h4 = new String("welcome");
				System.out.println("Case 2_1 " +(h3==h4)); //This returns false
				System.out.println("Case 2_2 " +h3.equals(h4)); //This returns true
				
				//so above returned false.The reason is as follows. "==" is used to compare objects and ".equals"
				//is used to compare value of objects
				
				
				//case3 (when objects are equal)
				
				String j1= "abc";
				String j2 = new String("abc");
				String j3 = j2;
				
				System.out.println("Case 3_1 "+(j1==j2)); //will return false
				System.out.println("Case 3_2 "+(j1.equals(j2))); //will return True
				System.out.println("Case 3_3 "+(j2==j3)); //will return True
				
				

				//=================================================================================================
				
				System.out.println("===========================Assignment 1: Check string is palindrome or not ================================");
				
				
				
				
				String k = "Welcome";
				String Palind = "";
				
				for(int i=k.length()-1;i>=0;i--) {
					
					Palind=Palind+k.charAt(i);
					
				}
				
			System.out.println("The reversed string is "+Palind);
			
			if(k==Palind) {
				
				System.out.println("The reversed string is is a palindrome of original string as both rsults showed"
						+ " as " +k+ " and " +Palind);
			}
			
			else {
				
				System.out.println("The reversed string is not a palindrome of original string as both rsults showed "
						+ " as " +k+ " and " +Palind);
			}
			
			//=================================================================================================
			
			System.out.println("===========================Assignment 2: Remove Junk/special characters ================================");
			
				

			String m = "Wel_&come";
			
			
			m=m.replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println("The filtered string is " +m);
			
			
			
//=================================================================================================
			
			System.out.println("===========================Assignment 3: Remove white spaces ================================");
			
			String o = "W e l c ome";
			
			
			o=o.replaceAll("\\s", "");
			
			System.out.println("The filtered string after removing white spaces is " +o);
			
			
			
//=================================================================================================
			
			System.out.println("===========================Assignment 4: Count occurance of particular character in a string ================================");
			
			String p = "abcabcaabbcc";
			
			int TotalCount = p.length();
			System.out.println("Total count is " +TotalCount );
			
			int replacedCpunt = p.replaceAll("a", "").length();
			System.out.println("replacedC ount count is " +replacedCpunt );
			
			System.out.println("The character a has been repeated " +(TotalCount-replacedCpunt)+ " times");
			
			
			
//=================================================================================================
			
			
				
	}//This is closing bracket for public static void main

}
