package com.ecommerce.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.common.CommonBase;
import com.ecommerce.pages.CartContentPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartContent extends CommonBase {

	WebDriver driver;
	CartContentPage CP;

	@Given("^User on Homepage$")
	public void user_on_Homepage() throws Throwable {
		driver = getDriver();
		driver.get(url);
		CP = PageFactory.initElements(driver, CartContentPage.class);
	}

	@When("^User click hardware under catagories section\\.$")
	public void user_click_hardware_under_catagories_section() throws Throwable {
		CP.Hardware().click();
	}

	@When("^User click printer$")
	public void user_click_printer() throws Throwable {
		CP.Printer().click();
	}

	@When("^User click buy now$")
	public void user_click_buy_now() throws Throwable {
		CP.BuyNow().click();
	}

	@When("^User open my Cart Content$")
	public void user_open_my_Cart_Content() throws Throwable {
		CP.CartContent().click();
	}

	@Then("^User should see printer in my Cart Content$")
	public void user_should_see_printer_in_my_Cart_Content() throws Throwable {

	}
}
