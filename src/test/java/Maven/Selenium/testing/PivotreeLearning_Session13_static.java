package Maven.Selenium.testing;


//Topic : Static

	/*
	take an example as below:
		
		           
		                 Class
		          ____________________________
		          |      Emp name            |
		          |       Emp id             |
		          |       Salary             | 
		          |       Department Number  |
		          |__________________________|
		          
		          Below are objects of class
		                
		                Object 1                           Object 2
		          ____________________________   _________________________
		          |      Emp name            |   |     Emp Name          |
		          |       Emp id             |   |     Emp Id            |
		          |       Salary             |   |     Salary            | 
		          |       Department Number  |   |     Department Number |
		          |__________________________|   |_______________________|
		          
		          In Object 1 and 2, we can assign unique emp name, emp id, salary. But the department number 
		          can be same since all the employees can belong to same department number
		          
		          So its a common variable for all objects.
		          Tomorrow if all employees move to a new department, we will have to change the department value in
		          all objects
		          
		          
		          To solve this, assign dept no value in class itself and make it static.
		          Also this variable becomes common to all objects
		          
		          
		          */
		          



public class PivotreeLearning_Session13_static {

	
	static int a=10;
		          
	int b = 20;
	
	static void m1() {  //static method
		
		System.out.println("This is m1 static method");
		
	}
		          
 void m2() { // non static method
		
		System.out.println("This is m2 static method");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//access static methods without creating objects
		
		System.out.println(a);
		m1();
		
		//access non static methods by creating objects
		PivotreeLearning_Session13_static TT = new PivotreeLearning_Session13_static();
		TT.m2();
		System.out.println(TT.b);

	}

}
