package com.ecommerce.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.common.CommonBase;
import com.ecommerce.pages.QuickFindPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuickFind extends CommonBase {

	WebDriver driver;
	QuickFindPage QP;
	
	@When("^user Move mouse over Quick Find section$")
	public void user_Move_mouse_over_Quick_Find_section() throws Throwable {
	    driver = getDriver();
	    driver.get(url);
	    
	    
	}

	@When("^User can write product name in Quick Find field\\.$")
	public void user_can_write_product_name_in_Quick_Find_field() throws Throwable {
	  
		QP = PageFactory.initElements(driver,QuickFindPage.class);
	    QP.SearchField().sendKeys("Beloved");
		//QP.OkButton().click();
	   
	}

	@When("^User click Quick Find$")
	public void user_click_Quick_Find() throws Throwable {
	   QP.QuickFind().click();
	}

	@Then("^User should see searched product in next page\\.$")
	public void user_should_see_searched_product_in_next_page() throws Throwable {
	    
	}
}
