package stepdefinitinChrome;

import baseclass.WrapperClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ParaMessagetocustomerPage;

public class ParaMrssagetocustomerChrome extends WrapperClass {
	
ParaMessagetocustomerPage mtc;
	
	@Given("^the user launchs the chrome browser$")
	public void the_user_launchs_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchingBrowser("chrome");
		mtc= new ParaMessagetocustomerPage(driver);
		
	}

	@When("^the user open the Parabank HomePage$")
	public void the_user_open_the_Parabank_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	    
	}

	@Then("^the user opens the msg and fill the details$")
	public void the_user_opens_the_msg_and_fill_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    mtc.fillMessageDetails();
	    
	}

	@And("^send the message to customer care$")
	public void send_the_message_to_customer_care() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mtc.sendMessage();
	   
	}

}
