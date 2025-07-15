package Maven.Selenium.testing;

public class PivotreeLearnSession12_constructor_Box {
	
	
	
	double width, height,depth;
	
	
	//define a default constructor
	
	PivotreeLearnSession12_constructor_Box(){
		
		width=height=depth=0;
		
	}
	
	//next define a constructor with parameters
PivotreeLearnSession12_constructor_Box(double w,double h,double d){
		
		width=w;
		height=h;
		depth=d;
		
	}

//another parameterized constructor
PivotreeLearnSession12_constructor_Box(double len){
	
	width=height=depth=len;
}

//create a user defined  method for volume

double volume() {
	return (width*height*depth);
	
}

}
