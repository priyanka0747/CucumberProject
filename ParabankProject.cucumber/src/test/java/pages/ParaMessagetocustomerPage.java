package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaMessagetocustomerPage {

	WebDriver driver;

	//Every element present in the Messagetocustomer page is identified 
	By msg=By.xpath("/html/body/div[1]/div[2]/ul[2]/li[3]/a");
	By msgName=By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input");
	By msgEmail=By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input");
	By msgPhone=By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input");
	By msgMessage=By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/textarea");
	By send=By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input");

	//Constructor to initialize the Browser  
	public ParaMessagetocustomerPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//Creating methods for each element present in Register page 
	public void fillMessageDetails()
	{
		driver.findElement(msg).click();
		driver.findElement(msgName).sendKeys("John");
		driver.findElement(msgEmail).sendKeys("John@gmail.com");
		driver.findElement(msgPhone).sendKeys("1234567890");
		driver.findElement(msgMessage).sendKeys("Great Service.");
	}


	//Method to Click send and close Browser
	public void sendMessage() throws InterruptedException
	{
		driver.findElement(send).click();
		Thread.sleep(3000);
		driver.close();
	}

}
