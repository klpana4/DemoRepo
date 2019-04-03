package pomtestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdmethods.ProjectMethods;

public class TC001_Login extends ProjectMethods {
	
	
	@BeforeTest
	
	public void setdata()
	{
	testCaseName="TC001_Login";
	testCaseDesc="login application";
	category="smoke";
	author="kalpana";
	dataSheetName="Login";
}
	
@Test(dataProvider="fetchData")
public void login(String username,String password,String color)

{ new LoginPage().enterUserName(username).enterPassword(password).ellogin();

}
	
 
}
