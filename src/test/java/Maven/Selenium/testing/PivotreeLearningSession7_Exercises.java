package Maven.Selenium.testing;

import java.util.Arrays;
import java.util.Scanner;

public class PivotreeLearningSession7_Exercises {
	
	

	
	public static void main(String[] args) {
		
		
		//Example 1a: Search element in array -Linear search
		
//	int a[] = {10,20,30,40,40}	;
//	int search_eleemet = 30;
//	boolean status = false;
//	
//	for(int i=0;i<a.length-1;i++) {
//		
//		if(a[i]==search_eleemet) {
//		System.out.println("Output of example 1a: Element found: "+a[i]);
//		status=true;
//		break;
//		
//		}
//		
//
//		
//	}
//	if(status==false) {
//	System.out.println("Output of example 1a : Element not found");
//	}
	

	//======================================================================
		
		
		
		
		
		
		
		
		
		
	
		//Example 1b : Same using enhanced for loop
	
	
//	int c[] = {10,20,30,40,40}	;
//	int search_element2 = 30;
//	boolean status1 = false;
//	
//	for(int x:c) {
//		if(x==search_element2) {
//			System.out.println("Output of example 1b : Element found: "+x);
//			status1=true;
//			break;
//			
//			}
//			
//	
//			
//		}
//		if(status1==false) {
//		System.out.println("Output of example 1b : Element not found");
//		}
		
	//===============================================================
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Example 2: find number of repetitions
	
	
//	int b[] = {100,200,100,300,100,400};
//	int num = 100;
//	int count = 0;
//	
//	for(int y:b) {
//		
//		if(y==num) {
//			
//			count++;
//		}
//	}
//		
//	System.out.println("Output of example 2:  The couny of num "+num+ " is :"+count);
		
		
		
	//===============================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Example 3a : Sorting Array
	
//	int d[] = {200,400,50,700,600};
//	
//	System.out.println("Output of example 3a before sorting " +Arrays.toString(d));
//	Arrays.sort(d);
//		
//	System.out.println("Output of example 3a after sorting  " +Arrays.toString(d));
//	
//	//Similarly for sorting string
//	
//	char e[] = {'D','B','C','A'};
//	System.out.println("Output of example 3b before sorting " +Arrays.toString(e));
//	Arrays.sort(e);
//	
//	System.out.println("Output of example 3b after sorting  " +Arrays.toString(e));
		
		
	
	//===============================================================
		
		
		
		
		
		
		
		
		
		
	
	//Example 4: Print array elements in reverse order
	
//	int f[] = {100,200,300,400,500};
//	
//	
//	
//for(int i=f.length-1;i>0;i--) {
//		
//	}
//	
//System.out.println("Reversing the string.Output after reversing is "+Arrays.toString(f));
	

//================================================================









//Example 5: Taking Input and printing numbers


//int g[] = new int[5];
//
//Scanner sc = new Scanner(System.in);
//
//for(int i=0;i<g.length;i++) {
//	
//	System.out.println("For example 5, Enter a value for the position " +i+":");
//	g[i]=sc.nextInt();
//	
//	
//}
//
//System.out.println("For example 5 , printing array :" +Arrays.toString(g));


//==========================================================================




//Assignment 1: Sorting elements using for loop : We can use bubble sort

int m[] = {50,20,40,10,100};


for(int i=0;i<m.length-1;i++) {
	
	for (int j=0;j<m.length-1;j++) {
		
	if (m[j]>m[j+1]) {
		int temp = m[j];
		m[j]=m[j+1];
		m[j+1]=temp;
		}
	
	}
	
}

	System.out.println("The sorted array for assigment 1 is : " +Arrays.toString(m));
	
	
	//===============================================================
	
	
	
	
	
	//Assignment 2: Find the missing number in array.This array
	//Does not have duplicates and the values should be in a range
	
	int arr[] = {1,2,4,5};
	
	int sum1 = 0;
	int sum2 = 0;
	
	for(int i=0;i<arr.length;i++) {
		
		sum1=sum1+arr[i];
		
	}
	
	System.out.println("Actual count is : "+sum1);
	
	
	
	
	for(int i=1;i<=5;i++) {
		
		sum2=sum2+i;
	}
	
	System.out.println("Present count is : "+sum2);
	
	int missingNumber = sum2-sum1;
	
	System.out.println("The missing number is : " +missingNumber);
	
	//Also adding that i have written a seperate program 
	//"CodingPrigram8_MissingNumberArray" for this assignment
	
	
	}//This is closing bracket for public static void main
	
	
	
	
	
	
	
	
	}
	
	


