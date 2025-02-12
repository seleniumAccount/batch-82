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

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		
		System.setProperty("Webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		driver.get("https://automationexercise.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		String fileName =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath = System.getProperty("user.dir")
				+ File.separator + "TestCase6/" + fileName;

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
		
		
		WebElement contactus=driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"));
		
		contactus.click();
		
		
		String fileName2 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath2 = System.getProperty("user.dir")
				+ File.separator + "TestCase6/" + fileName2;

		System.out.println(destinationFilePath);
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE); 
		File destination2 = new File(destinationFilePath2);
		try {
			FileUtils.copyFile(source2, destination2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement Name=driver.findElement(By.xpath("//input[@name=\"name\"]"));
		
		Name.sendKeys("Deepak");
		
		WebElement Emailid=driver.findElement(By.xpath("//form[@id=\"contact-us-form\"]/div[2]/input"));
		Emailid.sendKeys("Deepak.podile@gmail.com");
		
		WebElement subject=driver.findElement(By.xpath("//input[@name=\"subject\"]"));
		subject.sendKeys("issue with application");
		
		WebElement Message=driver.findElement(By.xpath("//textarea[@id=\"message\"]"));
		
		Message.sendKeys("hi");
		
		
		WebElement submitt=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		
		submitt.click();
		
		String fileName3 =(new Date()).toString().replace(" ", "_").replace(":", "-").trim() + ".png";
		 //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
		   //              Tue_Mar_08_10-16-06_IST_2022.png
		
		String destinationFilePath3 = System.getProperty("user.dir")
				+ File.separator + "TestCase6/" + fileName3;

		System.out.println(destinationFilePath);
		
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File source3 = ts3.getScreenshotAs(OutputType.FILE); 
		File destination3 = new File(destinationFilePath3);
		try {
			FileUtils.copyFile(source3, destination3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
