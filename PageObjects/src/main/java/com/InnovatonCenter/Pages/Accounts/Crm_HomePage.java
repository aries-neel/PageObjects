package com.InnovatonCenter.Pages.Accounts;

import org.openqa.selenium.By;

import com.InnovationCenter.Base.BasePage;

public class Crm_HomePage extends BasePage{
	
	public Crm_HomePage goToOpenTask() {
		
		driver.findElement(By.xpath(".//div[@class='widgetHeaderSection fs ' and @xpath='1']")).click();
		return this;
	}

}
