package Maven.Selenium.testing;


// https://www.youtube.com/watch?v=O6-yEvX3f9c&list=PLUDwpEzHYYLviMUSmqDyLly0wESzt7BfR&index=10

public class PivotreeLearningSesson12_Adder {

	
	//Below is method overloading
	
	int a=10,b=20;
	
	void sum() {  //1
		
		System.out.println(a+b);
		
		
	}
	
	void sum(int x,int y) {   //2
		
		
		System.out.println(x+y);
		
	}
	
void sum(int x,double y) {  //3
		
		
		System.out.println(x+y);
		
	}
	
void sum(double x,int y) {  //4
	
	
	System.out.println(x+y);
	
}



void sum(int a, int b , int c) {
	
	System.out.println(a+b+c);
	
	
}


	
	}
	
