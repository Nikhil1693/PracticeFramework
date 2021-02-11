package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pages.BasePage;
import com.pages.Page;

public class BaseTest {
	
	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value={"browser"})
	public void setup(String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\50024558\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\50024558\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("No browser is defined in XML file");
		}
		
		driver.get("https://classic.crmpro.com/login.cfm");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		page=new BasePage(driver);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
