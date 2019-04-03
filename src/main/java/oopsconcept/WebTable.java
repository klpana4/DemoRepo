package oopsconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Set binding
		// maximize the window
		driver.manage().window().maximize();
		// Set timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// load URL
		driver.get("https://erail.in");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("TBM",Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TSI",Keys.TAB);

	}

}
