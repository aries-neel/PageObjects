package com.InnovationCenter.testcases;

import com.InnovationCenter.Base.BasePage;

import com.InnovatonCenter.Pages.ZohoAppPage;
import com.InnovatonCenter.Pages.ZohoHomePage;
import com.InnovatonCenter.Pages.ZohoLoginPage;
import com.InnovatonCenter.Pages.Accounts.CreateAccounts;
import com.InnovatonCenter.Pages.Accounts.Crm_Accounts_CreatePage;
import com.InnovatonCenter.Pages.Accounts.Crm_HomePage;



public class Test {
	
	

	public static void main(String[] args) {
	
		 BasePage page= new BasePage();
		 ZohoHomePage zp= new ZohoHomePage();
		 ZohoLoginPage zl=zp.goToLogin();
		 ZohoAppPage za=  zl.doLogin();
		
		 BasePage.scrollToView();
		 Crm_HomePage crm_Home=za.goToCRM_Lnk();
		 CreateAccounts ca=page.menu.goToAccounts();
		 Crm_Accounts_CreatePage crm_Acc_Page=ca.goToCreateAccount_Lnk();
		 crm_Acc_Page.registerAccounts();

	}

}
