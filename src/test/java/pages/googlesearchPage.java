package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchPage {
	
	//Here first we create individual objects as below first and later we can implement actions from the testcase file
	
	
	//Create method for first object which is text box search
	
	public static WebElement textbox_search(WebDriver driver) {
		
		WebElement element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	//Create method for search button on Google
	
public static WebElement Button_search(WebDriver driver) {
		
		WebElement element = driver.findElement(By.name("btnk"));
		return element;
		
	}
	


	

}
