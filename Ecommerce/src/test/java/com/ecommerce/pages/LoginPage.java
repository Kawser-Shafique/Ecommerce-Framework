package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// object repository
	}

	@FindBy(xpath = "//*[@id=\"tdb3\"]/span[2]")
	WebElement MyAccount;

	public WebElement MyAccount() {
		return MyAccount;
	}

	@FindBy(name = "email_address")
	WebElement EmailAddress;

	public WebElement EmailAddress() {
		return EmailAddress;
	}

	@FindBy(name = "password")
	WebElement PassWord;

	public WebElement PassWord() {
		return PassWord;
	}

	@FindBy(xpath = "//*[@id=\"tdb1\"]/span[2]")
	WebElement OkButton;

	public WebElement OkButton() {
		return OkButton;
	}

}
