package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import excelutility.ExcelClass;

public class ParaRegisterPage {
	
	 WebDriver driver;
	   
	   By register=By.xpath("//*[@id='loginPanel']/p[2]/a");
	   By firstname=By.id("customer.firstName");
	   By lastname=By.id("customer.lastName");
	   By address=By.name("customer.address.street");
	   By city=By.id("customer.address.city");
	   By state=By.name("customer.address.state");
	   By zipcode=By.name("customer.address.zipCode");
	   By phoneNo=By.xpath("//*[@id='customer.phoneNumber']");
	   By SSN=By.id("customer.ssn");
	   By username=By.xpath("//table[@class='form2']//tbody//tr[10]//input");
	   By password=By.id("customer.password");
	   By confirmpassword=By.id("repeatedPassword");
	   By registerButton=By.xpath("//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input");
	   By logout=By.partialLinkText("Log Out");
	   
	 public ParaRegisterPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	   
	   public void registrationOfCustomer(int r)
	   {
		   ExcelClass ex=new ExcelClass();
		   
		   driver.findElement(register).click();
		  driver.findElement(firstname).sendKeys(ex.readXL(r,0));
		  driver.findElement(lastname).sendKeys(ex.readXL(r,1));
		  driver.findElement(address).sendKeys(ex.readXL(r,2));
		  driver.findElement(city).sendKeys(ex.readXL(r,3));
		  driver.findElement(state).sendKeys(ex.readXL(r,4));
		  driver.findElement(zipcode).sendKeys(ex.readXL(r,5));
		  driver.findElement(phoneNo).sendKeys(ex.readXL(r,6));
		  driver.findElement(SSN).sendKeys(ex.readXL(r,7));
		  driver.findElement(username).sendKeys(ex.readXL(r,8));
		  driver.findElement(password).sendKeys(ex.readXL(r,9));
		  driver.findElement(confirmpassword).sendKeys(ex.readXL(r,10));
	   }
	   
	   public void submitRegistration() throws InterruptedException
	   {
		   driver.findElement(registerButton).click();
		   Thread.sleep(3000);
		   driver.findElement(logout).click();
		   Thread.sleep(3000);
		   
	   }
	   
	   public void closeBrowser()
	   {
		 driver.close();
	   }

}
