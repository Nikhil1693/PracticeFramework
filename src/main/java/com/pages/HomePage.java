package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	private By header2=By.xpath("//td[contains(text(),'User: Demo User')]");

	public WebElement getHeader() {
		return getElement(header2);
	}

	public String getHomePageTitle() {
		return getPageTitle();
		
	}
	
	public String getHomePageHeader() throws InterruptedException {
		Thread.sleep(1000);
		return getPageHeader(header2);
	}
	
	
	
	

}
