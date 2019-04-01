package testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	import wdmethods.ProjectMethods;

	public class MergeLead extends ProjectMethods{
		@BeforeTest(groups = {"regression"})
		public void setValues() {
			testCaseName = "TC004_MergeLead";
			testCaseDesc =  "Merge Lead";
			category = "regression";
			author = "kalpana";		
		}
		@Test(groups = {"regression"})
		public void mergeLead() throws InterruptedException {
			click(locateElement("linkText", "Leads"));
			click(locateElement("linkText", "Merge Leads"));
			click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
			switchToWindow(1);
			type(locateElement("name", "firstName"), "Gopinath");
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(2000);
			String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			switchToWindow(0);
			
			click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
			switchToWindow(1);
			type(locateElement("name", "firstName"), "gopi");
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(2000);		
			clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			switchToWindow(0);
			
			clickWithNoSnap(locateElement("linkText", "Merge"));
			acceptAlert();
			
			click(locateElement("linkText", "Find Leads"));
			type(locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), txt);
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");		
		}
	}

