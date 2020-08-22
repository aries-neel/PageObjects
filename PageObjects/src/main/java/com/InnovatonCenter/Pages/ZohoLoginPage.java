package com.InnovatonCenter.Pages;

import org.openqa.selenium.By;


import com.InnovationCenter.Base.BasePage;

public class ZohoLoginPage extends BasePage {
	
	
		public ZohoAppPage doLogin() {
			
			driver.findElement(By.cssSelector("input#login_id")).sendKeys("innovativeneel@gmail.com");
			driver.findElement(By.cssSelector("#nextbtn")).click();
			driver.findElement(By.cssSelector("#password")).sendKeys("Neel@1992");
			driver.findElement(By.cssSelector("#nextbtn")).click();
			return new ZohoAppPage();
		}
}
