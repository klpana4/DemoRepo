package wdmethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectMethods extends SeMethods{

	public String dataSheetName;
	@BeforeSuite
	public void startSuite() {
		beginResult();
	}
	@BeforeClass
	public void beforeClass() {
		startTestCase();
	}
	
	
	@BeforeMethod(groups= {"common"})
	@Parameters("url")
	public void login(String url) {
		
		startApp("chrome",url);
		/*WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username); 
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("xpath","//a[contains(text(),'CRM/SFA')]");
		click(eleCRM);*/
	}
	
	@AfterMethod(groups="common")
	public void close() {
		closeAllBrowsers();
	}
	@AfterSuite
	public void afterSuite() {
		endResult();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] fetchData() throws IOException {
	return ReadExcel.getExcelData(dataSheetName);
	}
	
	
	
	
	
	
	
	
	
}