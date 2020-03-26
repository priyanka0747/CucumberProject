package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/para.feature",	
		plugin = {"pretty", "html:reports\\cucumber_html_report","json:reports\\cucumber_html_report\\jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports\\Extentreports\\Extentreport.html"},
		glue = {"stepdefinitinFirefox"},
		monochrome=true
		)

public class RunnerClassFirefox {
	
	@AfterClass
	public static void extendReport() {
    Reporter.loadXMLConfig("C:\\javacoding\\ParabankProject.cucumber\\src\\test\\resources\\extent_config.xml");
	
	
	
	}

}
