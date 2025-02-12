package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumdemo {
	
	static WebDriver driver=null;
	
	
	public static void commonsteps() {
	System.setProperty("webdriver.chrome.Driver","./Driver/chromedriver.exe");
	 
	 driver=new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/r.php?entry_point=login");
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().window().fullscreen();
	 
	 
	  
	}

	//error
	public static void main(String[] args) {

		// TODO Auto-generated method stub
	
		 commonsteps();
		 
		 //firstname
		 
		 WebElement firstname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		
		 firstname.sendKeys("deepak");
		 
		 WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		 
		 lastname.sendKeys("podile");
		 
		 Select daysDropdown=new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
		 
		 daysDropdown.selectByValue("5");
		 
		 
		 Select MonthDropdown=new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		 
		 //MonthDropdown.selectByValue("5");
		 
		 //INDEX N-1
		 
		 MonthDropdown.selectByIndex(2);
		 
		 //MonthDropdown.selectByVisibleText("11");--error
		 
		 
		 Select YearDropdown=new Select(driver.findElement(By.xpath("//select[@id=\"year\"]")));
		 
		 YearDropdown.selectByValue("2023");
		 
		 
		 
		
	}
		
		
	}

