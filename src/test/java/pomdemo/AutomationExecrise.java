package pomdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationExecrise {
	
	
		
	@FindBy(how=How.XPATH,using="//a[@href=\"/login\"]")
	public WebElement SignuporLogin;
	
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/div[3]/div/form/input[2]")
	public WebElement FirstName;
	
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/div[3]/div/form/input[3]")
	public WebElement emailid;
	
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/div[3]/div/form/button")
	public WebElement signup;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"id_gender1\"]")
	public WebElement gender;
	
	@FindBy(how=How.XPATH,using="//input[@type=\"password\"]")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using="//select[@id=\"days\"]")
	public WebElement daysDropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id=\"months\"]")
	public WebElement monthDropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id=\"years\"]")
	public WebElement yearDropdown;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"newsletter\"]")
	public WebElement checkbox;
	
	@FindBy(how=How.XPATH,using="//input[@name=\"optin\"]")
	public WebElement checkbox2;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"first_name\"]")
	public WebElement name;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"last_name\"]")
	public WebElement lastname;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"company\"]")
	public WebElement companyname;

	@FindBy(how=How.XPATH,using="//input[@id=\"address1\"]")
	public WebElement address1;
	@FindBy(how=How.XPATH,using="//input[@id=\"address2\"]")
	public WebElement address2;
	@FindBy(how=How.XPATH,using="//select[@id=\"country\"]")
	public WebElement Country;
	@FindBy(how=How.XPATH,using="//input[@id=\"state\"]")
	public WebElement State;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"city\"]")
	public WebElement city;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"zipcode\"]")
	public WebElement Zipcode;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"mobile_number\"]")
	public WebElement  Mobilenumber;
	
	@FindBy(how=How.XPATH,using="//section[@id=\"form\"]/div/div/div/div[1]/form/button")
	public WebElement createaccount;
	
	@FindBy(how=How.XPATH,using="//section[@id=\"form\"]/div/div/div/div/a")
	public WebElement proceed;
	
	@FindBy(how=How.XPATH,using="//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
	public WebElement deleteaccount;
	
	@FindBy(how=How.XPATH,using="//section[@id=\"form\"]/div/div/div/div/a")
	public WebElement proceed2;
	
	@FindBy(how=How.XPATH,using="//section[@id=\"form\"]/div/div/div[1]/div/form/button")
	public WebElement Login;
	
	@FindBy(how=How.XPATH,using="//section[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
	
	public WebElement loginusermailid;
	
	
	
	
	
	
}
	
	
