package com.amazon.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.base.Base;

public class HomePage extends Base{
	
	
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p']")
	private WebElement Timeatwork;
	
	@FindBy(xpath="//p[text()='My Actions']")
	private WebElement MyActions;
	
	@FindBy(xpath="//p[text()='Quick Launch']")
	private WebElement QuickLaunch;
	
	@FindBy(xpath="//p[text()='Employees on Leave Today']")
	private WebElement EmployeesonLeaveToday;
	
	@FindBy(xpath="//p[text()='Buzz Latest Posts']")
	private WebElement BuzzLatestPosts;
	
	@FindBy(xpath="//p[text()='Employee Distribution by Sub Unit']")
	private WebElement EmployeeDistributionbySubUnit;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leave;
	
	@FindBy(xpath="//button[@title='Apply Leave']")
	private WebElement applyleave;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
		}
	
	public String getCurrURL() {
		String homePageURL=driver.getCurrentUrl();
		return homePageURL;
	}
	
	public AdminPage clickAdmin() {
		admin.click();
		return new AdminPage();
	}
	
	public LeavePage clickLeave() {
		leave.click();
		return new LeavePage();
	}
	
	
	public void waitForDashboardToLoad() {
		wait.until(ExpectedConditions.visibilityOf(Dashboard));
	}
	
	public boolean isTimeAtWorkWidgetDisplayed() {
		return Timeatwork.isDisplayed();
	}
	
	public boolean isMyActionsWidgetDisplayed() {
		return MyActions.isDisplayed();
	}
	public boolean isQuickLaunchWidgetDisplayed() {
		return QuickLaunch.isDisplayed();
	}
	public boolean isEmployeesOnLeaveTodayWidgetDisplayed() {
		return EmployeesonLeaveToday.isDisplayed();
	}
	public boolean isBuzzLatestPostsWidgetDisplayed() {
		return BuzzLatestPosts.isDisplayed();
	}
	public boolean isEmployeeDistributionbySubUnitDisplayed() {
		return EmployeeDistributionbySubUnit.isDisplayed();
	}
	
	
	
	
}
