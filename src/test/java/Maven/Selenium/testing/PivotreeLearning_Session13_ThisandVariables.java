package Maven.Selenium.testing;


/*

Topics for discussion:
=======================
This keyword
Class variables
Local variables


*/


public class PivotreeLearning_Session13_ThisandVariables {
	

	 
	int x,y; //class variables
	
	//a and b are local variables
	
	/*
	in below, instead of a and b, in the constructor, we can also use x and y, but the compiler will get confused 
	 on whuch x and y to use.in that case we can use this key word.Refer below example with 2nd constructor.
	When running constructor 1, comment constructor 2 and vica versa
	
	Note that though "this" is written inside the constructor 2, "this" refers to the class.By using "this",
	the class variable and the local variable is differentiated
	
	This applies for both constructors and methods
	
	*/
	
	
	//create a constructor 1
	
	/*
	
	 PivotreeLearning_Session13_ThisandVariables(int a,int b){
		 x=a;
		 y=b;
		 
		 }
		 
		 */
		 
		
	 
	 
//create a constructor 2


	 PivotreeLearning_Session13_ThisandVariables(int x,int y){
		 this.x=x;
		 this.y=y;
		 
	 }
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		PivotreeLearning_Session13_ThisandVariables th = new PivotreeLearning_Session13_ThisandVariables(100,200);
		//abve is initializing the constructor and passing values
		th.display();
		
		
	}
	
	
	
	
	
	

}
