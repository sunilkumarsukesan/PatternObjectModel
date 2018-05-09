package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	//Clicking Leads tab
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement Leads;
	public MyLeadsPage clickLeads() {
		click(Leads);
		return new MyLeadsPage();		
	}
		

}
