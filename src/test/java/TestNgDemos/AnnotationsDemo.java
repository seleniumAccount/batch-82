package TestNgDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class AnnotationsDemo {
	
    @Test
	public void testMethod() {
System.setProperty("Webdriver.chrome.driver","/.Driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		
		searchbox.sendKeys("iphone");
		
		String fileName =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath = System.getProperty("user.dir")
				+ File.separator + "Deepak/" + fileName;

		System.out.println(destinationFilePath);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE); 
		File destination = new File(destinationFilePath);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
@AfterMethod
public void testMethod1() {
	
	System.setProperty("Webdriver.chrome.driver","/.Driver/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	
	searchbox.sendKeys("iphone");
	
	String fileName =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
	 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
	   //              Tue_Mar_08_10-16-06_IST_2022.png
	
	String destinationFilePath = System.getProperty("user.dir")
			+ File.separator + "Deepak/" + fileName;

	System.out.println(destinationFilePath);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE); 
	File destination = new File(destinationFilePath);
	try {
		FileUtils.copyFile(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	
}
