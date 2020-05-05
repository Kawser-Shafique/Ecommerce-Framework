package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartContentPage {
	WebDriver driver;

	public CartContentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //*[@id=\"columnLeft\"]/div[1]/div[2]/a[1]")
	WebElement Hardware;

	public WebElement Hardware() {
		return Hardware;
	}

	@FindBy(xpath = " //*[@id=\"bodyContent\"]/div/div/table/tbody/tr[3]/td[1]/a")
	WebElement Printer;

	public WebElement Printer() {
		return Printer;
	}

	@FindBy(xpath = "//*[@id=\"tdb4\"]/span[2]")
	WebElement BuyNow;

	public WebElement BuyNow() {
		return BuyNow;
	}

	@FindBy(xpath = " //*[@id=\"tdb1\"]/span[2]")
	WebElement CartContent;

	public WebElement CartContent() {
		return CartContent;
	}

}
