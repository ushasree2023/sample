package com.testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.WebElements;
import utils.BaseClass;

public class Register extends BaseClass {

	@Test(priority = 1)
	public void account() {
		WebElements elements = new WebElements(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(elements.MyAccount)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.Register)).click();
	}

	@Test(priority = 2)
	public void registerPage() throws Exception {

		WebElements elements = new WebElements(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(elements.FirstName)).sendKeys(FirstName);
		wait.until(ExpectedConditions.visibilityOf(elements.LastName)).sendKeys(LastName);
		wait.until(ExpectedConditions.visibilityOf(elements.Email)).sendKeys(EmailID);
		wait.until(ExpectedConditions.visibilityOf(elements.mobile)).sendKeys(phone);
		wait.until(ExpectedConditions.visibilityOf(elements.password)).sendKeys(password);
		wait.until(ExpectedConditions.visibilityOf(elements.confirmpswd)).sendKeys(confirmPassword);
		wait.until(ExpectedConditions.visibilityOf(elements.newsLetter)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.checkbox)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.submit)).click();
		logger.info((elements.content).getText());
		wait.until(ExpectedConditions.visibilityOf(elements.MyAccount)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.Logout)).click();
		
		wait.until(ExpectedConditions.visibilityOf(elements.MyAccount)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.Register)).click();
		


	}


}
