package com.katalon.project.web

import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class base {

	public static WebDriver driver
	public static WebDriverWait wait
	public static Actions actions
	

	@Keyword
	public static void setUp(){
		driver = DriverFactory.getWebDriver();
		wait = new WebDriverWait(driver, 10);
		actions = new Actions(driver);
	}
}
