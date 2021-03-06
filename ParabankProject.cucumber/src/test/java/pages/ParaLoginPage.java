package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import excelutility.ExcelClass;

public class ParaLoginPage {

	WebDriver driver;
	//Every element present in the Login page is identified 
	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	By logout=By.partialLinkText("Log Out");

	//Constructor to initialize the Browser 
	public ParaLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}


	//Creating methods for each element present in Login page 
	public void enterUsername(int a)
	{
		ExcelClass ex=new ExcelClass();
		driver.findElement(username).sendKeys(ex.readXL(a,8));
	}

	public void enterPassword(int a)
	{
		ExcelClass ex=new ExcelClass();
		driver.findElement(password).sendKeys(ex.readXL(a,9));
	}

	public void logInButton() throws InterruptedException
	{
		driver.findElement(login).click();
		Thread.sleep(3000);
		driver.findElement(logout).click();
		Thread.sleep(3000);

	}


	//Method to close Browser
	public void closeBrowser()
	{
		driver.close();
	}


}
