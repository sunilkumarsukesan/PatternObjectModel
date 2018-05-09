package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	//Clicking Create Lead link
		@FindBy(how=How.LINK_TEXT,using="Create Lead")
		private WebElement Create_Lead;
		public CreateLeadPage clickCreateLead() {
			click(Create_Lead);
			return new CreateLeadPage();		
		}
		
	//Clicking Find lead link
		@FindBy (how=How.LINK_TEXT,using="Find Leads")
		private WebElement find_Lead;
		public FindLeadPage clickFindLead()
		{
			click(find_Lead);
			return new FindLeadPage();
		}
}
