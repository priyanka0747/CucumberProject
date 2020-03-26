package stepdefinitionFirefox;

import baseclass.WrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ParaLoginPage;

public class ParaLoginFirefox extends WrapperClass{
	
	ParaLoginPage lp;
	
	
	  @Given("^the user launch the chrome browser$") 
	  public void
	  the_user_launch_the_chrome_browser() throws Throwable { // Write code here  that turns the phrase above into concrete actions 
		  launchingBrowser("firefox");
		  lp=new ParaLoginPage(driver);
		  
		  }
	  
	  @When("^the user open the Parabankpage$") 
	  public void  the_user_open_the_Parabankpage() throws Throwable { // Write code here that turns the phrase above into concrete actions 
	  getUrl();
	  
	  
	  }
	 
	@Then("^enter username and password then login$")
	public void enter_username_and_password_then_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=1;i<=3;i++)
		{
	    lp.enterUsername(i);
	    lp.enterPassword(i);
	    lp.logInButton();
		}
		lp.closeBrowser();
		
	}

}
