package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	
	public LoginPage ()
	
	{
		PageFactory.initElements(driver,this);
		}
	@FindBy(id="username")
	WebElement elusername;
	@And("Enter the User Name as (.*)")
 public LoginPage enterUserName(String username) 
 {
type(elusername, username);
	return this;
}
	
	public LoginPage verifyUserNameColor(String data) {
		verifyExactAttribute(elusername,"id", data);
		return this;
	}
	@FindBy(id="password")
	WebElement elpassword;
	@And("Enter the User Name as (.*)")
 public LoginPage enterPassword(String password) 
 {
type(elpassword, password);
	return this;
}
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	WebElement ellogin;
	
 public HomePage ellogin() 
 {
click(ellogin);
	return new HomePage();
}
	

	
}