package stepdefinitionFirefox;

import baseclass.WrapperClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ParaBillpayPage;

public class ParaBillpayFirefox extends WrapperClass {
	
ParaBillpayPage bp;
	
	@Given("^the user launch the chrome$")
	public void the_user_launch_the_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchingBrowser("firefox");
		bp= new ParaBillpayPage(driver);
		
	}

	@When("^the user open the Parabank Login Page$")
	public void the_user_open_the_Parabank_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	    
	}

	@Then("^the user login to the account$")
	public void the_user_login_to_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    bp.customerLogin();
	   
	}

	@And("^the user fills the details of the bill pay$")
	public void the_user_fills_the_details_of_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   bp.customerBillPay();
	   
	}

	@And("^submit the bill pay$")
	public void submit_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    bp.submitBillPay();
	    
	}

}
