package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickFindPage {

	WebDriver driver;

	public QuickFindPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement SearchField;

	public WebElement SearchField() {
		return SearchField;

	}

	@FindBy(xpath = "//input[@type='image']")
	WebElement QuickFind;

	public WebElement QuickFind() {
		return QuickFind;

	}
}
