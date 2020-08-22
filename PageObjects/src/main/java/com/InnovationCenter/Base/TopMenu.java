package com.InnovationCenter.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.InnovatonCenter.Pages.Accounts.CreateAccounts;

public class TopMenu {
	// HasA relationship with the page as page has a top menu
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver=driver;
		
	}
	public void goToHome() {
	
		driver.findElement(By.xpath(".//div[@data-value='Home']")).click();
	}
	public void goToContacts() {
		
		driver.findElement(By.xpath(".//div[@data-value='Contacts']")).click();
	}
	public void goToLeads() {
		
		driver.findElement(By.xpath(".//div[@data-value='Leads']")).click();
	}
	public CreateAccounts goToAccounts() {
		
		driver.findElement(By.xpath(".//div[@data-value='Accounts']")).click();
		return new CreateAccounts();
	}
}
