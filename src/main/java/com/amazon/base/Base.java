package com.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	 
	 
	 
	 @BeforeTest
	 public  void loadConfig() {
		 try {
			 prop=new Properties();
			 System.out.println("super constructor invoked");
			 FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/Configuration/config.properties");
			 prop.load(ip);
			 //System.out.println("driver: "+driver);
		 }
		 catch(FileNotFoundException e) {
			 e.printStackTrace();
		 }catch(IOException e) {
			 e.printStackTrace();
			 
		 }
		 
	 }
	 
	 public static void launchApp() {
		 WebDriverManager.chromedriver().setup();
		 String browserName=prop.getProperty("browser");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
	 }
	 
	
	 
	 
}
