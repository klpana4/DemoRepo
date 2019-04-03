package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.ProjectMethods;

public class HomePage extends ProjectMethods{
public HomePage()
{
PageFactory.initElements(driver, this);
}

@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
WebElement elecrm;
@And("click on crmsfa")

public NewHomePage clickcrmsf()
{
click(elecrm);
return new NewHomePage();

}
}
