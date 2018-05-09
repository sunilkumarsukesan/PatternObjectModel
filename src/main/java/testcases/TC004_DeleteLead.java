package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="Delete a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sunil";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String vName, String firstName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM_SFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLeadsButton()
		.selectingFirstResult()
		.clickDeleteButton();
	}

}
