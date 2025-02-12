package automationexercise;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("Webdriver.chrome.driver","/.Driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String fileName =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName;

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
		
		WebElement SignuporLogin=driver.findElement(By.xpath("//a[@href=\"/login\"]"));
		
        Actions actions=new Actions(driver);
        actions.doubleClick( SignuporLogin).build().perform();
        
        WebElement FirstName=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
        
        FirstName.sendKeys("Deepak");
        
        WebElement emailid=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
        
        emailid.sendKeys("Deepak.podile@gmail.com");
        
        WebElement signup=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
		
        Actions actions1=new Actions(driver);
        actions1.doubleClick( signup).build().perform();
        
        String fileName1 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath1 = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName1;

		System.out.println(destinationFilePath1);
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE); 
		File destination1 = new File(destinationFilePath1);
		try {
			FileUtils.copyFile(source1, destination1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement gender=driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
		
		gender.click();
		
		 String fileName7 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		String destinationFilePath7 = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName7;

		System.out.println(destinationFilePath1);
		
		TakesScreenshot ts7 = (TakesScreenshot) driver;
		File source7 = ts7.getScreenshotAs(OutputType.FILE); 
		File destination7 = new File(destinationFilePath7);
		try {
			FileUtils.copyFile(source7, destination7);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		password.sendKeys("Deepak@83");
		
		Select daysDropdown=new Select(driver.findElement(By.xpath("//select[@id=\"days\"]")));
		
		daysDropdown.selectByValue("24");
		
		Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id=\"months\"]")));
		
		monthDropdown.selectByValue("4");
		
		Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id=\"years\"]")));
		
		yearDropdown.selectByVisibleText("1993");
		
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id=\"newsletter\"]"));
		
		checkbox.click();
		
		WebElement checkbox2=driver.findElement(By.xpath("//input[@name=\"optin\"]"));
		
		checkbox2.click();
		
		
		WebElement name=driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		
		name.sendKeys("deepak");
		
		
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
		
		lastname.sendKeys("podile");
		
         WebElement Companyname=driver.findElement(By.xpath("//input[@id=\"company\"]"));
		
         Companyname.sendKeys("IIFL");
         
         WebElement address1=driver.findElement(By.xpath("//input[@id=\"address1\"]"));
 		
		 address1.sendKeys("5-11");
		 
		 
		 WebElement address2=driver.findElement(By.xpath("//input[@id=\"address2\"]"));
			
		 address2.sendKeys("dilshuknagar");
		
		Select countryname=new Select(driver.findElement(By.xpath("//select[@id=\"country\"]")));
		
		countryname.selectByVisibleText("Canada");
		
		 WebElement State=driver.findElement(By.xpath("//input[@id=\"state\"]"));
			
		 State.sendKeys("Telangana");
		 
		 WebElement City=driver.findElement(By.xpath("//input[@id=\"city\"]"));
			
		 City.sendKeys("Hyderabad");
		 
		 WebElement Zipcode=driver.findElement(By.xpath("//input[@id=\"zipcode\"]"));
			
		 Zipcode.sendKeys("500060");
		 
		 WebElement Mobilenumber=driver.findElement(By.xpath("//input[@id=\"mobile_number\"]"));
			
		 Mobilenumber.sendKeys("8712346567");
		 
		 String fileName11 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath11 = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName11;

		System.out.println(destinationFilePath11);
		
		TakesScreenshot ts11 = (TakesScreenshot) driver;
		File source11 = ts11.getScreenshotAs(OutputType.FILE); 
		File destination11 = new File(destinationFilePath11);
		try {
			FileUtils.copyFile(source11, destination11);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		WebElement createaccount=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div[1]/form/button"));
		
		createaccount.click();
		
		 String fileName111 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath111 = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName111;

		System.out.println(destinationFilePath111);
		
		TakesScreenshot ts111 = (TakesScreenshot) driver;
		File source111 = ts111.getScreenshotAs(OutputType.FILE); 
		File destination111 = new File(destinationFilePath111);
		try {
			FileUtils.copyFile(source111, destination111);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement proceed=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div/a"));
		
		 proceed.click();
		 
		 
		 String fileName4 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath4 = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName4;

		System.out.println(destinationFilePath4);
		
		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File source4 = ts4.getScreenshotAs(OutputType.FILE); 
		File destination4 = new File(destinationFilePath4);
		try {
			FileUtils.copyFile(source4, destination4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		WebElement deleteaccount=driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
		
		deleteaccount.click();
		
		String fileName5 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath5 = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName5;

		System.out.println(destinationFilePath5);
		
		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File source5 = ts5.getScreenshotAs(OutputType.FILE); 
		File destination5 = new File(destinationFilePath4);
		try {
			FileUtils.copyFile(source5, destination5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		WebElement proceed2=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div/a"));
		
		proceed2.click();
		
		String fileName6 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath6 = System.getProperty("user.dir")
				+ File.separator + "deepak/" + fileName6;

		System.out.println(destinationFilePath6);
		
		TakesScreenshot ts6 = (TakesScreenshot) driver;
		File source6 = ts6.getScreenshotAs(OutputType.FILE); 
		File destination6 = new File(destinationFilePath4);
		try {
			FileUtils.copyFile(source6, destination6);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		 
	}

}