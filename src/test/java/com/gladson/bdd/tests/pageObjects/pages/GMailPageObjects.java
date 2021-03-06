/**
 * 
 */
package com.gladson.bdd.tests.pageObjects.pages;

import static com.gladson.bdd.main.controllers.WebDriverFactory.getWebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.gladson.bdd.main.utils.ExplicitWaiting;

import io.qameta.allure.Step;

/**
 * @author Gladson Antony
 * @date Sep 17, 2016
 * 
 */
public class GMailPageObjects
{
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailIDTextBox;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextButton;

	@Step("To Enter Email ID and Click Next Button")
	public GMailPageObjects enterEmailID(String emailID) 
	{
		ExplicitWaiting.explicitWaitElementToBeClickable(emailIDTextBox,10);
		emailIDTextBox.sendKeys(emailID);	
		nextButton.click();
		return this;
	}

	@Step("Verify the Page Title of the GMail Page")
	public GMailPageObjects verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "gagagasgasg");
		return this;
	}
	
	
	
}
