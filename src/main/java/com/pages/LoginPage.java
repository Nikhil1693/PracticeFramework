package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//pagelocators
	
	private By login=By.name("username");
	private By password=By.name("password");
	private By submit=By.xpath("//input[@class='btn btn-small']");
	private By header=By.xpath("//p[contains(text(),'2019 © CRMPRO')]");
	
	//getter	
	public WebElement getLogin() {
		return getElement(login);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getSubmit() {
		return getElement(submit);
	}

	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getLoginPagetitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username,String password) {
		getLogin().sendKeys(username);
		getPassword().sendKeys(password);
		getSubmit().click();
		
		return getInstance(HomePage.class);
		
	}

	//overloading
	public void doLogin() {
		getLogin().sendKeys("");
		getPassword().sendKeys("");
		getSubmit().click();
		
		}
	


}
