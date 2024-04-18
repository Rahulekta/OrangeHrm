package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Base;
import com.amazon.pom.HomePage;
import com.amazon.pom.SignIn;

public class LoginPageTest extends Base {
	SignIn sign;
	HomePage homePage;
 
	@BeforeMethod
	public void setup() {
		launchApp();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginTest() {
		sign=new SignIn();
		homePage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualURL=homePage.getCurrURL();
		System.out.println(actualURL);
		String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actualURL, ExpectedURL);
		
		
	}
}
