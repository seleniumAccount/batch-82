package seleniumdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreencartWaitDemo {
	
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//2.link ==eclipse+real browser using selenium
		//object creation not happens directly 
		 driver=new ChromeDriver();
		
	   // RBIBank bank=new SBIBank();//polymorphism method overriding
		//3.url -->amazon
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//wait
		
		//serach button code
		WebElement searchButton=driver.findElement(By.xpath("//input[@type=\"search\"]"));
		searchButton.sendKeys("ber");
		
		//common-logic 
		//list + for =each click Webelement 
		
		List<WebElement> prodCount = driver.findElements(By.xpath("//div[@class=\"products\"]/div"));
		int count = prodCount.size();
		System.out.println("total products are :" + count);
		Thread.sleep(5000);
		List<WebElement> addtocartBtn = driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]"));

		for (WebElement we : addtocartBtn) {
			we.click();
		}
		
		String[] names= {"Deepak","yoganand","sudhakar","uma"};
		for(String name:names) {
			System.out.println(name);
		}
		WebElement cart_image = driver.findElement(By.xpath("//img[@alt=\"Cart\"]"));
		cart_image.click();

		WebElement proceed_to_check = driver.findElement
				(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(proceed_to_check)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
		
		WebElement promo_textbox=driver.findElement(By.xpath("//input[@class=\"promoCode\"]"));
		promo_textbox.sendKeys("rahulshettyacademy");
		
		WebElement apply_button=driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
		apply_button.click();
		
		

		// getting the successmessage from the screen
		WebElement successMsg = driver.findElement(By.xpath("//span[@class=\"promoInfo\"]"));
		
		WebDriverWait wait_success = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait_success.until(ExpectedConditions.elementToBeClickable(successMsg));
		
		String message = successMsg.getText();//getText() method...
		System.out.println(message);
		

		

	}

}
