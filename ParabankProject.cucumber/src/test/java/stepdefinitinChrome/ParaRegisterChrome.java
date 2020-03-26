package stepdefinitinChrome;

import baseclass.WrapperClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ParaRegisterPage;

public class ParaRegisterChrome extends WrapperClass{
	
ParaRegisterPage prp;	
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchingBrowser("chrome");
		 prp= new ParaRegisterPage(driver);
		 		
	}

	@When("^the user open the Parabank Registration page$")
	public void the_user_open_the_Parabank_Registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   getUrl();
	   
	}

	@Then("^user gives the details and submits the registration$")
	public void user_gives_the_details_and_submits_the_registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=1;i<=3;i++)
		{
	    prp.registrationOfCustomer(i);
	    prp.submitRegistration();
		}
		prp.closeBrowser();
		 
	}
	
	

}
