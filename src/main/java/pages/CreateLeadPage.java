package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}


	//Typing Company name
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;

	public CreateLeadPage enterCompanyName(String data) {
		type(companyName, data);
		return this;
	}


	//Typing First Name
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;

	public CreateLeadPage enterFirstName(String data) {
		type(firstName, data);
		return this;
	}


	//Typing Last Name
		@FindBy(how=How.ID,using="createLeadForm_lastName")
		private WebElement lastName;

		public CreateLeadPage enterLastName(String data) {
			type(lastName, data);
			return this;
		}
		
	//Clicking create lead button
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement LeadButton;

	public ViewLeadPage clickLeadButton() {
		click(LeadButton);
		return new ViewLeadPage();		
	}

}
