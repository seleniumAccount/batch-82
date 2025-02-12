package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pomdemo.AutomationExecrise;

public class TestCase2 {

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
		
        page.SignuporLogin.click();
        page.loginusermailid.sendKeys("Deepak.podile@gmail.com");
        page.password.sendKeys("Deepak@83");
        page.Login.click();
        page.deleteaccount.click();
        
        
		
}
	
}
