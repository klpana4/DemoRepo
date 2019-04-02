package testcases;


	import org.openqa.selenium.WebElement;
    import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import wdmethods.ProjectMethods;

	public class CreateLead extends ProjectMethods{
		@BeforeTest(groups = {"smoke"})
		public void setData() {
			testCaseName = "TC002_CreateLead";
			testCaseDesc =  "Create a new";
			category = "smoke";
			author = "sethu";
			dataSheetName = "testdata";
			
		}
		
		@Test(groups = {"Smoke"},dataProvider = "fetchData")
		public void createLead(String cName,String fName,String lName) {
			WebElement eleLeads = locateElement("xpath","//a[contains(text(),'Leads')]");
			click(eleLeads);
			WebElement eleCrateLead = locateElement("xpath","//a[contains(text(),'Create Lead')]");
			click(eleCrateLead);
			WebElement eleCN = locateElement("id","createLeadForm_companyName");
			type(eleCN,cName);
			WebElement eleFN = locateElement("id","createLeadForm_firstName");
			type(eleFN,fName);
			WebElement eleLN = locateElement("id","createLeadForm_lastName");
			type(eleLN,lName);
			WebElement eleCreateLeadButton = locateElement("class","smallSubmit");
			click(eleCreateLeadButton);
			
		}
	}


