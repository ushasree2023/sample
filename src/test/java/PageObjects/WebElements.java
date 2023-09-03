package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class WebElements extends BaseClass {

	public WebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	public WebElement MyAccount;

	@FindBy(xpath = "//a[text()='Register']")
	public WebElement Register;

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement Email;
	
	@FindBy(xpath = "//input[@name='telephone']")
	public WebElement mobile;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@name='confirm']")
	public WebElement confirmpswd;
	
	@FindBy(xpath = "//input[@checked='checked' and @name='customer_group_id']")
	public WebElement radiobutton;
	
	@FindBy(xpath = "//input[@name='newsletter']")
	public WebElement newsLetter;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath = "//*[@id='content']")
	public WebElement content;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	public WebElement Logout;
	

}
