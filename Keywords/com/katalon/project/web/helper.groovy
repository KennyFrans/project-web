package com.katalon.project.web

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword

public class helper extends base{

	@Keyword
	public static getResolution = {
		def size = driver.manage().window().getSize().toString()
		println("Your resolution browser is : ".concat(size))
	}

	@Keyword
	public static selectHotelDestination(String itemSearch, String searchBy){
		def listData = defineWebElement("//div[@id='s2id_autogen1']//a[@class='select2-choice']", 'xpath')
		
		listData.click()

		def inpDestination = defineWebElement("//div[@class='select2-search']//input[@class='select2-input select2-focused']",'xpath')

		inpDestination.sendKeys(itemSearch)

		def divSearchBy = defineWebElement("//div[contains(text(),${searchBy})]/following-sibling::ul/li[contains(@class,'select2-highlighted')]", 'xpath')

		divSearchBy.click()
	}
	
	@Keyword
	public static scrollToElement(WebElement object){
		actions.moveToElement(object).perform()
	}

	@Keyword
	public static WebElement defineWebElement(String locator, String type){
		WebElement defineElement

		type = type.toLowerCase()
		switch(type){
			case type = "xpath" :
				defineElement = driver.findElement(By.xpath(locator))
				break;
			case type = "id" :
				defineElement = driver.findElement(By.id(locator))
				break;
			case type = "cssselector" :
				defineElement = driver.findElement(By.cssSelector(locator))
				break;
			case type = "cssname" :
				defineElement = driver.findElement(By.className(locator))
				break;
			case type = "linktext" :
				defineElement = driver.findElement(By.linkText(locator))
				break;
			case type = "name" :
				defineElement = driver.findElement(By.name(locator))
				break;
			case type = "partiallink" :
				defineElement = driver.findElement(By.partialLinkText(locator))
				break;
			case type = "tag" :
				defineElement = driver.findElement(By.tagName(locator))
				break;
		}
		return defineElement
	}

	@Keyword
	public static WebElement defineWebElement(WebElement object, String locator, String type){
		WebElement defineElement

		type = type.toLowerCase()
		switch(type){
			case type = "xpath" :
				defineElement = object.findElement(By.xpath(locator))
				break;
			case type = "id" :
				defineElement = object.findElement(By.id(locator))
				break;
			case type = "cssselector" :
				defineElement = object.findElement(By.cssSelector(locator))
				break;
			case type = "cssname" :
				defineElement = object.findElement(By.className(locator))
				break;
			case type = "linktext" :
				defineElement = object.findElement(By.linkText(locator))
				break;
			case type = "name" :
				defineElement = object.findElement(By.name(locator))
				break;
			case type = "partiallink" :
				defineElement = object.findElement(By.partialLinkText(locator))
				break;
			case type = "tag" :
				defineElement = object.findElement(By.tagName(locator))
				break;
		}
		return defineElement
	}

	@Keyword
	public static List<WebElement> defineWebElements(String locator, String type){
		List<WebElement> defineElement

		type = type.toLowerCase()
		switch(type){
			case type = "xpath" :
				defineElement = driver.findElements(By.xpath(locator))
				break;
			case type = "id" :
				defineElement = driver.findElements(By.id(locator))
				break;
			case type = "cssselector" :
				defineElement = driver.findElements(By.cssSelector(locator))
				break;
			case type = "cssname" :
				defineElement = driver.findElements(By.className(locator))
				break;
			case type = "linktext" :
				defineElement = driver.findElements(By.linkText(locator))
				break;
			case type = "name" :
				defineElement = driver.findElements(By.name(locator))
				break;
			case type = "partiallink" :
				defineElement = driver.findElements(By.partialLinkText(locator))
				break;
			case type = "tag" :
				defineElement = driver.findElements(By.tagName(locator))
				break;
		}
		return defineElement
	}

	@Keyword
	public static List<WebElement> defineWebElements(WebElement object, String locator, String type){
		List<WebElement> defineElement

		type = type.toLowerCase()
		switch(type){
			case type = "xpath" :
				defineElement = object.findElements(By.xpath(locator))
				break;
			case type = "id" :
				defineElement = object.findElements(By.id(locator))
				break;
			case type = "cssselector" :
				defineElement = object.findElements(By.cssSelector(locator))
				break;
			case type = "cssname" :
				defineElement = object.findElements(By.className(locator))
				break;
			case type = "linktext" :
				defineElement = object.findElements(By.linkText(locator))
				break;
			case type = "name" :
				defineElement = object.findElements(By.name(locator))
				break;
			case type = "partiallink" :
				defineElement = object.findElements(By.partialLinkText(locator))
				break;
			case type = "tag" :
				defineElement = object.findElements(By.tagName(locator))
				break;
			default :
				println("Please insert the type correctly!")
		}
		return defineElement
	}
}
