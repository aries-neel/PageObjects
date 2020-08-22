package com.InnovationCenter.Base;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	
	// super to all the base pages as in it waraper over all the sub pages
	public static  WebDriver driver;
	public static TopMenu menu;
	
	
	public BasePage() {
		
		if(driver==null) {
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
		 HashMap<String, Object> prefs= new HashMap<String, Object>();
	        prefs.put("safebrowsing.enabled", "true"); 
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.default_content_setting_values.notifications", 2);
	        prefs.put("password_manager_enabled", false);
	        options.setExperimentalOption("prefs", prefs); 
	        options.addArguments("--disable-notifications");
	        options.addArguments("--start-maximized");
	        options.addArguments("disable-infobars");
		 
		 
		 
		 driver = new ChromeDriver(options);
		 driver.get("https://www.zoho.com/");
		 /*driver.manage().window().maximize();*/
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 menu=new TopMenu(driver);
		 
	}
	}
	public static void scrollToView() {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
  	      js.executeScript("window.scrollBy(350,400)");
		
	}

}
