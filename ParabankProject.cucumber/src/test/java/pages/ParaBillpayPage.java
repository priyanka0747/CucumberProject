package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBillpayPage {

	WebDriver driver;

	//Every element present in the Billpay page is identified 
	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	By billpay=By.xpath("//*[@id='leftPanel']/ul/li[4]/a");
	By payeename=By.name("payee.name");
	By address=By.name("payee.address.street");
	By payeecity=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[3]/td[2]/input");
	By payeestate=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[4]/td[2]/input");
	By payeeZipcode=By.xpath("//table[@class='form2']//tbody//tr[5]//input");
	By payeephoneno=By.xpath("//table[@class='form2']//tr[6]//td[2]/input");
	By accountno=By.name("payee.accountNumber");
	By verifyaccount=By.xpath("//input[@name='verifyAccount']");
	By amount=By.name("amount");
	By submit=By.xpath("//table[@class='form2']//tr[14]//input");

	//Constructor to initialize the Browser  
	public ParaBillpayPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//Creating methods for each element present in Login page 
	public void customerLogin()
	{
		driver.findElement(username).sendKeys("asish123_a@aa1");
		driver.findElement(password).sendKeys("123qwe");
		driver.findElement(login).click();
	}

	//Creating methods for each element present in Billpay page 
	public void customerBillPay()
	{
		driver.findElement(billpay).click();
		driver.findElement(payeename).sendKeys("Harsha");
		driver.findElement(address).sendKeys("ZP colony 1st street");
		driver.findElement(payeecity).sendKeys("Chennai");
		driver.findElement(payeestate).sendKeys("TamilNadu");
		driver.findElement(payeeZipcode).sendKeys("524004");
		driver.findElement(payeephoneno).sendKeys("1234567890");
		driver.findElement(accountno).sendKeys("1234");
		driver.findElement(verifyaccount).sendKeys("1234");
		driver.findElement(amount).sendKeys("20");

	}



	//Method to Submit bill pay and close Browser
	public void submitBillPay() throws InterruptedException
	{
		driver.findElement(submit).click();
		Thread.sleep(3000);
		driver.close();
	}

}
