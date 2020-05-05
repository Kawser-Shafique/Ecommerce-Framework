package com.ecommerce.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.common.CommonBase;
import com.ecommerce.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends CommonBase {
	 WebDriver driver;
	 LoginPage LP;
	
	@Given("^Open browser and start application$")
	public void open_browser_and_start_application() throws Throwable {
	 driver = getDriver();
	 driver.get(url);
	 LP = PageFactory.initElements(driver,LoginPage.class);
	}

	@When("^Move mouse over my account button$")
	public void move_mouse_over_my_account_button() throws Throwable {
		 LP.MyAccount().click();
	}

	@When("^Put valid email address in email address field$")
	public void put_valid_email_address_in_email_address_field() throws Throwable {
		LP.EmailAddress().sendKeys("kawser.shafique@gmail.com");
	}

	@When("^Put valid password in password field$")
	public void put_valid_password_in_password_field() throws Throwable {
		LP.PassWord().sendKeys("kawser01");
	}

	@When("^Click ok button$")
	public void click_ok_button() throws Throwable {
		LP.OkButton().click();
		//driver.close();
	}

	@Then("^Validate login status by showing your name$")
	public void validate_login_status_by_showing_your_name() throws Throwable {
	    
	}



}
