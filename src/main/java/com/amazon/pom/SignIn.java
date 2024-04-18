package com.amazon.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.base.Base;

public class SignIn extends Base {
	
	@FindBy(name="username")
	private WebElement uname;
	
	
	@FindBy(name="password")
	private WebElement pwtextbox;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	
	
	public SignIn() {
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage login(String username,String password ) {
		
		
		uname.sendKeys(username);
		pwtextbox.sendKeys(password);
		Login.click();
		return new HomePage();
	}
	
	

}
