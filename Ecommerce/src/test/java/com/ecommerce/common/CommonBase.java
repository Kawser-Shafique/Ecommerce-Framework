package com.ecommerce.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CommonBase {

	WebDriver driver;
	String Browser = "chrome";
	public String url = "https://demo.oscommerce.com/";

	public  WebDriver getDriver() {

		if (Browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Browser == "firefox") {
			driver = new FirefoxDriver();

		} else if (Browser == "opera") {
			driver = new OperaDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}
}
