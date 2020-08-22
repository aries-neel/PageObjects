package com.InnovatonCenter.Pages.Accounts;

import org.openqa.selenium.By;

import com.InnovationCenter.Base.BasePage;

public class Crm_Accounts_CreatePage extends BasePage{
	
	
	public void registerAccounts() {
		
		driver.findElement(By.xpath(".//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys("Nilam Singh");;
	}
	
	

}
