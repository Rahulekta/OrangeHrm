package com.amazon.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Base;
import com.amazon.pom.AdminPage;
import com.amazon.pom.HomePage;
import com.amazon.pom.SignIn;

public class AdminPageTest extends Base{
	HomePage homepage;
	SignIn sign;
	AdminPage admin;
	@BeforeMethod
	public void setup() {
		launchApp();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testSelectUserRole() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		admin=homepage.clickAdmin();
		admin.selectUserRole();
		admin.selectStatusBox();
		admin.clickOnSearch();
	}
	

}
