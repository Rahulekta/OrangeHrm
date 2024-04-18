package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Base;
import com.amazon.pom.HomePage;
import com.amazon.pom.SignIn;

public class HomePageTest extends Base {
	
	HomePage homepage;
	SignIn sign;
	@BeforeMethod
	public void setup() {
		launchApp();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@Test
	public void testTimeAtWorkWidgetDisplayed() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result=homepage.isTimeAtWorkWidgetDisplayed();
		Assert.assertTrue(result);
		
	}
	@Test
	public void testMyActionsWidgetDisplayed() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result=homepage.isMyActionsWidgetDisplayed();
		Assert.assertTrue(result);
		
	}
	@Test
	public void testQuickLaunchWidgetDisplayed() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result=homepage.isQuickLaunchWidgetDisplayed();
		Assert.assertTrue(result);
		
	}
	@Test
	public void testEmployeesOnLeaveTodayWidgetDisplayed() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result=homepage.isEmployeesOnLeaveTodayWidgetDisplayed();
		Assert.assertTrue(result);
		
		
	}
	
	@Test
	public void testBuzzLatestPostsWidgetDisplayed() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result=homepage.isBuzzLatestPostsWidgetDisplayed();
		Assert.assertTrue(result);
		
		
	}
	
	@Test
	public void testEmployeeDistributionbySubUnitDisplayed() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result=homepage.isEmployeeDistributionbySubUnitDisplayed();
		Assert.assertTrue(result);
		
		
	}
	
}
