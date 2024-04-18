package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.Base;

public class AdminPage extends Base {
	
	public Select select;
	
	@FindBy(xpath="//label[text()='User Role']")
	private WebElement userroleselectbox;
	
	
	@FindBy(xpath="//select[@class='oxd-select-text-input']")
	private WebElement statusselectbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	private WebElement text;
	
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectUserRole() {
		select=new Select(userroleselectbox);
		select.selectByIndex(1);
		System.out.println(select);
	}
	
	public void selectStatusBox() {
		select=new Select(statusselectbox);
		select.selectByIndex(1);
		System.out.println(select);
	
		
	}
	public void clickOnSearch() {
		searchbutton.click();
		System.out.println(text);
		
		
	}

}
