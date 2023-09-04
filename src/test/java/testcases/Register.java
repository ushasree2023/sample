package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.RegisterPage;
import utilities.BaseClass;
import utilities.MyScreenRecording;

public class Register extends BaseClass {
	
	
	@Test(priority = 1)
	public void registerpage() throws Exception  {
		
		MyScreenRecording.startRecording("RegisterPage");
		
		RegisterPage elements = new RegisterPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(elements.FirstName)).sendKeys(FirstName);
		logger.info("FirstName");
		wait.until(ExpectedConditions.visibilityOf(elements.LastName)).sendKeys(LastName);
		logger.info("LastName");
		
	//	MyScreenRecording.stopRecording();
		
	}
	
	@Test(priority = 2)
	public void details() {
		
		RegisterPage elements = new RegisterPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(elements.Email)).sendKeys(Email);
		logger.info("Email");
		wait.until(ExpectedConditions.visibilityOf(elements.mobile)).sendKeys(mobile);
		logger.info("mobile");
		
		
	}
	
}
