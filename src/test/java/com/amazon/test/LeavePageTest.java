package com.amazon.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Base;
import com.amazon.pom.AdminPage;
import com.amazon.pom.HomePage;
import com.amazon.pom.LeavePage;
import com.amazon.pom.SignIn;

public class LeavePageTest extends Base {
	
	HomePage homepage;
	SignIn sign;
	AdminPage admin;
	LeavePage leavepage;
	
	
	@BeforeMethod
	public void setup() {
		launchApp();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testSelectDropDown() {
		sign=new SignIn();
		homepage=sign.login(prop.getProperty("username"), prop.getProperty("password"));
		leavepage=homepage.clickLeave();
		leavepage.selectDropDown();
		leavepage.clickOnSearch();
		
	    
	}

}
