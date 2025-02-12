package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pomdemo.AutomationExecrise;

public class TestCase1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Properties obj=new Properties();
		
		FileInputStream objfile=new FileInputStream(System.getProperty("user.dir")+"//Validations//AutomationExecrise.properties");
		
		try {
			obj.load(objfile);
		}
			
			catch (IOException e) {
				e.printStackTrace();
			}
		
		String Driver_path=obj.getProperty("Driver_folder_path");
		
		String driver_type=obj.getProperty("driver_type");
		
		String app_url=obj.getProperty("Application_url");
		
		System.setProperty(Driver_path, driver_type);
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(app_url);
		
		driver.manage().window().fullscreen();
		
		
		
		AutomationExecrise page=PageFactory.initElements(driver, AutomationExecrise.class);
		page.SignuporLogin.sendKeys(Keys.ENTER);
		
		page.FirstName.sendKeys("Deepak");
		page.emailid.sendKeys("Deepak.podile@gmail.com");
		page.signup.sendKeys(Keys.ENTER);
		page.gender.click();
		page.password.sendKeys("Deepak@83");
		page.daysDropdown.sendKeys("24");
		page.monthDropdown.sendKeys("4");
		page.yearDropdown.sendKeys("2024");
		page.checkbox.click();
		page.checkbox2.click();
		page.name.sendKeys("deepak");
		page.lastname.sendKeys("podile");
		page.companyname.sendKeys("IIFL");
		page.companyname.sendKeys("IIFL");
		page.address1.sendKeys("hyderabad");
		page.address2.sendKeys("hyderabad");
		page.Country.sendKeys("india");
		page.State.sendKeys("telangana");
		
		page.city.sendKeys("dilshuknage");
		
		page.Zipcode.sendKeys("560000");
		page.Mobilenumber.sendKeys("8712346567");
		
		page.createaccount.click();
		page.proceed.click();
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		}
		
	}
