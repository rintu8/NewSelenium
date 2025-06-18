package Maven.Selenium.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CodingPractce_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://www.amazon.in/");
		
		//Take screenshot by below:
		
		try {
		File f = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\rintu.george\\Documents\\Sel2\\Selenium\\Screenshot"
				+ "\\screenshot1.jpg"));
		}
		catch(NumberFormatException nfe) {
			
			
			System.out.println("Screenshopt failed");
		}
		
		
	driver1.quit();
			
			
			
		
	}

}
