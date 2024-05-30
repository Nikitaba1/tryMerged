package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import fileUtility.File_Utility;

public class CrmTest {
	WebDriver driver;
	@Test
	public void crmcontactTest() throws Exception {
		File_Utility fu = new File_Utility();
		String Browser = fu.readDataFromPropertyFile("browser");
		if(Browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else {
			driver = new EdgeDriver();
		}
		String URL = fu.readDataFromPropertyFile("url");
		String UN = fu.readDataFromPropertyFile("username");
		String PW = fu.readDataFromPropertyFile("password");
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PW);
		driver.findElement(By.id("submitButton")).click();
		driver.quit();
		
		
	}

}
