package automationexercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase16 {

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
        
        
        WebElement Emailid=driver.findElement(By.xpath("//input[@type=\"email\"]"));
        
        Emailid.sendKeys("Deepak.podile@gmail.com");
        
        WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
        
        password.sendKeys("Deepak@83");
        
        WebElement loginaccount=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        
        loginaccount.click();
        
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
