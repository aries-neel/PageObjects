package com.InnovatonCenter.Pages;

import org.openqa.selenium.By;


import com.InnovationCenter.Base.BasePage;

public class ZohoLoginPage extends BasePage {
	
	
		public ZohoAppPage doLogin() {
			
			type("username_CSS", "innovativeneel@gmail.com");
			driver.findElement(By.cssSelector("#nextbtn")).click();
			
			type("password_CSS", "Neel@1992");
			driver.findElement(By.cssSelector("#nextbtn")).click();
			return new ZohoAppPage();
		}
}
