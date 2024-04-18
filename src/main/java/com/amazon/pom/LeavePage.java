package com.amazon.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.base.Base;

public class LeavePage extends Base {
	
	@FindBy(xpath="//div[text()='Select']")
	private WebElement selectdropdown;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	
	public void selectDropDown() {
		
		List<WebElement> selectdropdown=driver.findElements(By.xpath("//div[text()='Select']"));
		selectdropdown.get(0).getText();
		
	}
	
	public void clickOnSearch() {
		search.click();
		
	}
	
	

}
