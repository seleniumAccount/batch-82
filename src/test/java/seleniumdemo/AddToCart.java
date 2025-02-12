package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.Driver","./Driver/chromedriver.exe");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().window().fullscreen();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 WebElement SearchBox=driver.findElement(By.xpath("//input[@type=\"search\"]"));
		
		 SearchBox.sendKeys("ber");
		 
		 WebElement Submitbutton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		 
		 Submitbutton.click();
		 
		 driver.get("https://www.flipkart.com/apple-iphone-15-black-128-gb/p/itm6ac6485515ae4?pid=MOBGTAGPTB3VS24W&lid=LSTMOBGTAGPTB3VS24WKFODHL&marketplace=FLIPKART&q=iphone+15&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_na&fm=search-autosuggest&iid=a7eaa71b-9d72-4a85-a49f-e3991ddcd164.MOBGTAGPTB3VS24W.SEARCH&ppt=sp&ppn=sp&ssid=ean6tezkpc0000001737513463187&qH=2f54b45b321e3ae5");
		 
		 WebElement AddToCart=driver.findElement(By.xpath("//button[@class=\"QqFHMw cNEU5Q J9Kkbj _7Pd1Fp\"]"));
		 
		 AddToCart.click();
		 
		 WebElement PlaceOrderbutton=driver.findElement(By.xpath("//button[@class=\"QqFHMw zA2EfJ _7Pd1Fp\"]"));
		 PlaceOrderbutton.click();
	}
	
}
