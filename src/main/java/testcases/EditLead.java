package testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import wdmethods.ProjectMethods;

	public class EditLead extends ProjectMethods{
		@BeforeTest(groups = {"sanity"})
		public void setValues() {
			testCaseName = "TC002_EditLead";
			testCaseDesc =  "Edit Lead";
			category = "sanity";
			author = "kalpana";
			dataSheetName = "EditLead";
			
		}
		
		@Test(groups = {"sanity"}, dataProvider = "fetchData")
		public void editLead(String searchFirstName, String dropDownValue) throws InterruptedException {
			
			click(locateElement("linkText", "Leads"));
			click(locateElement("linkText", "Find Leads"));
			type(locateElement("xpath", "(//input[@name='firstName'])[3]"), searchFirstName);
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(3000);
			click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			verifyTitle("View Lead | opentaps CRM");
			click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
			selectDropDownUsingText(locateElement("id", "updateLeadForm_industryEnumId"), dropDownValue);
			click(locateElement("xpath", "//input[@class='smallSubmit']"));			
		}
	}



