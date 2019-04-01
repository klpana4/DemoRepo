package testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdmethods.ProjectMethods;

public class DeleteLead extends ProjectMethods
{

		@BeforeTest(groups = {"sanity"})
		public void setValues() 
		
		{
			testCaseName = "TC004_DeleteLead";
			testCaseDesc =  "Delete Lead";
			category = "sanity";
			author = "gopi";		
		}
		
		
		@Test(groups = {"sanity"})
		public void deleteLead() throws InterruptedException {
			
			click(locateElement("linkText", "Leads"));
			click(locateElement("linkText", "Find Leads"));
			type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "");
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(3000);
			String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			verifyTitle("View Lead | opentaps CRM");
			click(locateElement("linkText", "Delete"));
			
			click(locateElement("linkText", "Find Leads"));
			type(locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), txt);
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");		
		}
	}


