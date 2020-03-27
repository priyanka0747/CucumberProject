package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaAdminPage {
	
	WebDriver driver;

	//Every element present in the Admin page is identified
	By adminfield=By.xpath("/html/body/div[1]/div[2]/ul[1]/li[6]/a");
	By submit=By.xpath("/html/body/div[1]/div[3]/div[2]/form/input");

	//Constructor to initialize the Browser  
	public ParaAdminPage(WebDriver driver)
	{
	this.driver=driver;
	}

	 //Creating methods for each element present in Register page 
	public void selectAdminpage()
	{
		driver.findElement(adminfield).click();
	}
	
	//Method to Submit and close Browser
	public void submitAdministration() throws InterruptedException
	{
		driver.findElement(submit).click();
		Thread.sleep(3000);
		driver.close();
	}

}
