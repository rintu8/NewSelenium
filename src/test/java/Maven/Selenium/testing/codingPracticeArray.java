package Maven.Selenium.testing;

public class codingPracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Initializing array
		
		
		
		//Type of arrays
		//1.Single dimensional
		//2. Multi dimensional
		
		
		//First lets check single dimensiona array

		//Step 1:
			//Initializing array
			
//			int a[]=new int[5];
//			
//			a[0] = 100;
//			a[1]=200;
//			a[2]=300;
//			a[3]=400;
//			a[4]=500;
//			
//			for (int i=0;i<a.length;i++) {
//				System.out.println(a[i]);
//			}
		
		//===================================================
		//2nd way to initialize aray inckudes declaration and 
		//assignment of values in same step
		
		// also below using for loop we inerate and ready the single dimensional array
		
//		int b[] = {100,200,300,400,500};
//		for (int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		
		//==================================================
		
		//Below is example using for each loop
		
//		int c[] = {100,200,300,400,500};
//		
//		for(int x : c) {
//			
//			System.out.println(x);
//			
//			
//		}
		
		
		//========================================
		
		//2 dimensional arrays-has rows and columns
		
//		int[][] a = new int[3][2];
//		
//		a[0][0]= 100;
//		a[0][1]= 200;
//		
//		a[1][0]= 300;
//		a[1][1]= 400;
//		
//		a[0][0]= 500;
//		a[0][1]= 600;
		
		//================================================
		
		//Find size id multi dimensional array
		
//int[][] a = new int[3][2];
//		
//		a[0][0]= 100;
//		a[0][1]= 200;
//		
//		a[1][0]= 300;
//		a[1][1]= 400;
//		
//		a[0][0]= 500;
//		a[0][1]= 600;
//		
//		System.out.println("Length of Rows : " +a.length);
//		System.out.println("Length of columns : " +a[0].length);
		
		
		//========================================
		
		
		//multi dimensional array : read single value from multidimensional array
		
		//First initialize an array
//		
//		int a[][] = {{100,200},{300,400},{500,600}};
//		
//		
//		
//		System.out.println(a[1][1]);
		
		
		//===========================================
		
		//To print all values in multi dimensional array
//		
//		int a[][] = {{100,200},{300,400},{500,600}};
//		
//		for(int r=0;r<=a.length-1;r++) {
//			for(int s=0;s<=a[r].length-1;s++) {
//				System.out.println(a[r][s]+" ");
//			}
//			System.out.println(); // This is just print blank line for alignment
//		}
		
		//======================================
		
		//Repeat same multi dimensioma array teration as abobe using enhanced for loop
		
		int a[][] = {{100,200},{300,400},{500,600}};
		
		for(int arr[]:a) {
			
			for(int x: arr) {
				
				System.out.println(x + " ");
			}
			
			
		}
		
		
	}

}
