package javaDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Properties obj=new Properties();
		
		FileInputStream objfile=new FileInputStream(System.getProperty("user.dir")+"\\validations\\flipkart.properties");
		
		try {
			obj.load(objfile);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		String Drivers_path=obj.getProperty("Driver_Folder_path");
		
		String Driver_Type=obj.getProperty("Driver_Type");
		
		String App_Url=obj.getProperty("Application_Url");
		
		System.setProperty(Drivers_path,Driver_Type);
		
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get(App_Url);
	    
	    driver.manage().window().maximize();
	    
	    WebElement searchbox=driver.findElement(By.xpath("//input[@name=\"q\"]"));
	    
	    searchbox.sendKeys("iphone");
	    
	    
	  
	    
		
		
		
		
		
	
		

	}

}
