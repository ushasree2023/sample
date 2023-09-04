package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class RegisterPage extends BaseClass {

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
			public WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	public WebElement Email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	public WebElement mobile;
	
	

}
