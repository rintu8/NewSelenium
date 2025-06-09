package Maven.Selenium.testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebpageLaunch {
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://demo.applitools.com/");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"username\"]")));
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("standard_user");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"password\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test2");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"log-in\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		
		
		//Alert alert = driver.switchTo().alert();
		
//		 wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert_box = driver.switchTo().alert();
//		alert_box.accept();
		
		//System.out.println(driver.switchTo().alert().getText());
		//alert_box.accept(); 
		//driver.close();
		
		

		    
		
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,400)");
		
	}

}
