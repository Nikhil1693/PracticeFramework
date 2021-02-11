package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLoginPageTitleTest() throws InterruptedException {
		String title=page.getInstance(LoginPage.class).getLoginPagetitle();
		Thread.sleep(5000);
		System.out.println(title);
		
		Assert.assertEquals(title, "CRMPRO Log In Screen");
	}
	
	@Test(priority=1)
	public void verifyLoginPageHeader() throws InterruptedException {
	
		String header=page.getInstance(LoginPage.class).getLoginPageHeader();
		Thread.sleep(5000);
		System.out.println(header);
		Assert.assertEquals(header, "2019 © CRMPRO");
	}
	
	@Test(priority=2)
	public void login() throws InterruptedException {
		HomePage homepage=page.getInstance(LoginPage.class).doLogin("batchautomation", "Test@12345");
		Thread.sleep(2000);
		String headerName=homepage.getHomePageHeader();
		System.out.println(headerName);
		Assert.assertEquals(headerName, "User: Demo User");
	}
	
}
