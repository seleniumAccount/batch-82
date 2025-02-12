package javaDemos;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethod{
	
	public static void main(String[]arags) {
		
		System.setProperty("webdriver.chrome.Driver","./Driver/chromedriver.exe");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().window().fullscreen();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	
}
 
