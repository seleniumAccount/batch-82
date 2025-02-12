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
import org.openqa.selenium.support.ui.Select;

public class TestCase14 {

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
				+ File.separator + "TestCase14/" + fileName;

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
		
		
		WebElement addtocart=driver.findElement(By.xpath("//section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a"));
		addtocart.click();
		
		WebElement Viewcart=driver.findElement(By.xpath("//div[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u"));
		Viewcart.click();
		
		
		driver.manage().window().maximize();
		
		WebElement proceedtocheckout=driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]"));
		proceedtocheckout.click();
		
		WebElement Registerorlogin=driver.findElement(By.xpath("//div[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u"));
		Registerorlogin.click();
		
		
        WebElement FirstName=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
        
        FirstName.sendKeys("Deepak");
        
        WebElement emailid=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
        
        emailid.sendKeys("Deepak.podile@gmail.com");
        
        WebElement signup=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
        signup.click();
        
		
		WebElement gender=driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
		
		gender.click();
        
        
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
		 
		 WebElement Createaccount=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div[1]/form/button"));
		 
		 Createaccount.click();
		 	
		 WebElement proceed=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div/a"));
			
		 proceed.click();
		 
		 WebElement cart=driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
			
		 cart.click();
		 
		 WebElement checkout=driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]"));
			
		 checkout.click();
		 
		 WebElement comment=driver.findElement(By.xpath("//textarea[@class=\"form-control\"]"));
			
		 comment.sendKeys("hi");
		 
		 WebElement placeorder=driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]"));
			
		 placeorder.click();
		 
		 WebElement Nameoncard=driver.findElement(By.xpath("//input[@name=\"name_on_card\"]"));
			
		 Nameoncard.sendKeys("Deepak");
		 
		 
		 WebElement cardnumber=driver.findElement(By.xpath("//input[@name=\"card_number\"]"));
			
		 cardnumber.sendKeys("123412341234");
		 
		 WebElement CVV=driver.findElement(By.xpath("//input[@name=\"cvc\"]"));
			
		 CVV.sendKeys("Deepak");
		 
		 
		 WebElement EXP=driver.findElement(By.xpath("//input[@name=\"expiry_month\"]"));
			
		 EXP.sendKeys("Deepak");
		 
		 WebElement year=driver.findElement(By.xpath("//input[@name=\"expiry_year\"]"));
			
		 year.sendKeys("Deepak");
		 
		
		 WebElement pay=driver.findElement(By.xpath("//button[@class=\"form-control btn btn-primary submit-button\"]"));
			
		 pay.click();
		 
		 WebElement deleteaccount=driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
			
		 deleteaccount.click();
		 

		 WebElement proceed2=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div/a"));
			
		 proceed2.click();
		 
		 
		 
		 
		 
		
		 
		
		  
	}

}
