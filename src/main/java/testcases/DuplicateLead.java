package testcases;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import wdmethods.ProjectMethods;

	public class DuplicateLead extends ProjectMethods{
		@BeforeTest(groups = {"regression"})
		public void setValues() {
			testCaseName = "TC005_DuplicateLead";
			testCaseDesc =  "Duplicate Lead";
			category = "regression";
			author = "koushik";
			
		}
		@Test(groups = {"regression"})
		public void duplicateLead() throws InterruptedException {
			click(locateElement("linkText", "Leads"));
			click(locateElement("linkText", "Find Leads"));
			click(locateElement("xpath", "//span[contains(text(),'Phone')]"));
			type(locateElement("name", "phoneNumber"), "");
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(2000);
			String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			click(locateElement("linkText", "Duplicate Lead"));
			click(locateElement("xpath", "//input[@name='submitButton']"));				
		}
	}


