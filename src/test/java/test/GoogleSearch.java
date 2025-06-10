package test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googlesearchPage;

public class GoogleSearch {
	
	
	
	
	public static void googlesearch() {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		
		
		
		googlesearchPage.textbox_search(driver).sendKeys("Automation");
		
		
		googlesearchPage.Button_search(driver).sendKeys(Keys.RETURN);
	}
	
	public static void main (String[]args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		
		
		
		googlesearchPage.textbox_search(driver).sendKeys("Automation");
		
		
		googlesearchPage.Button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		
	}

}
