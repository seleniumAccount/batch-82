package automationexercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("Webdriver.chrome.driver","/.Driver/chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://automationexercise.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().window().fullscreen();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			


			
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
			 
			
			 
			
			WebElement createaccount=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div[1]/form/button"));
			
			createaccount.click();
			
			
			
			WebElement proceed=driver.findElement(By.xpath("//section[@id=\"form\"]/div/div/div/div/a"));
			
			 proceed.click();
			 
			 
			 WebElement addtocart=driver.findElement(By.xpath("//section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a"));
				addtocart.click();
					
			    WebElement Viewcart=driver.findElement(By.xpath("//div[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u"));
				Viewcart.click();
					
					
				driver.manage().window().maximize();
					
				WebElement proceedtocheckout=driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]"));
				proceedtocheckout.click();
				
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
