package com.InnovatonCenter.Pages;

import org.openqa.selenium.By;

import com.InnovationCenter.Base.BasePage;
import com.InnovatonCenter.Pages.Accounts.Crm_HomePage;

public class ZohoAppPage extends BasePage {

	public Crm_HomePage goToCRM_Lnk() {
		//span[@class='_logo-crm _logo-x96 zod-app-logo']
		driver.findElement(By.xpath(".//span[@class='_logo-crm _logo-x96 zod-app-logo']")).click();
		return new Crm_HomePage();
	}

	public void goToCliq_Lnk() {

		driver.findElement(By.xpath(".//div[contains(text(),'Cliq')]")).click();

	}

	public void goToAnalytics_Lnk() {

		driver.findElement(By.xpath(".//div[contains(text(),'Analytics')]")).click();

	}

	public void goToBooks_Lnk() {

		driver.findElement(By.xpath(".//div[contains(text(),'Books')]")).click();

	}

	public void goToConnect_Lnk() {

		driver.findElement(By.xpath(".//div[contains(text(),'Connect')]")).click();

	}

	public void goToCreator_Lnk() {

		driver.findElement(By.xpath(".//div[contains(text(),'Creator')]")).click();

	}
}
