package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends FindLeadPage {
	

	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement viewLeadFirstName;
	public ViewLeadPage verifyCreateLeadName(String data) {
		verifyPartialText(viewLeadFirstName, data);
		return this;		
	}
	
	//Clicking Delete button
	@FindBy(how =How.LINK_TEXT,using="Delete")
	private WebElement deleteButton;
	public MyLeadsPage clickDeleteButton() {
		click(deleteButton);
		return new MyLeadsPage();
	}

}
