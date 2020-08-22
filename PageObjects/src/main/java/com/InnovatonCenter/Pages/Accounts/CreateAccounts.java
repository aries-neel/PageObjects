package com.InnovatonCenter.Pages.Accounts;

import org.openqa.selenium.By;


import com.InnovationCenter.Base.BasePage;

public class CreateAccounts extends BasePage{

	public Crm_Accounts_CreatePage goToCreateAccount_Lnk() {

		driver.findElement(By.xpath(".//button[@class='lyte-button lytePrimaryBtn']")).click();
		return new Crm_Accounts_CreatePage();
	}

	public void goToImportsAccounts_Lnk() {

		driver.findElement(By.xpath("lyte-button ob_outlineprimarybtn lyteDefaultBtn")).click();
	}
}
