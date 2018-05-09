package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {
	
	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Type the first name
	@FindBy(how = How.NAME, using="firstName")
	private WebElement first_Name;
	public FindLeadPage enterFirstName(String firstName) {
		type(first_Name, firstName);
		return this;
	}
	
	//Clicking on findleads button
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findLeadsButton;
	public FindLeadPage clickFindLeadsButton() {
		click(findLeadsButton);
		return this;
	}
	
	//Selecting the first result
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")
	private WebElement firstResult;
	public ViewLeadPage selectingFirstResult() {
		click(firstResult);
		return new ViewLeadPage();
	}

	
}
