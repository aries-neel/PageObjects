package com.InnovatonCenter.Pages;

import org.openqa.selenium.By;

import com.InnovationCenter.Base.BasePage;

public class ZohoHomePage extends BasePage{
	
	
	public ZohoLoginPage goToLogin() {
		
		// bussiness loginc to perform the click action
		
		     driver.findElement(By.cssSelector(".zh-login")).click();
			return new ZohoLoginPage();
			
	}

	public void goToCustomer() {
		driver.findElement(By.cssSelector(".zh-customers")).click();
	}

	public void goToContactSales() {
		driver.findElement(By.cssSelector(".zh-contact")).click();
	}

	public void goToSupport() {
		driver.findElement(By.cssSelector(".zh-support")).click();
	}

}
