package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestcaseTest {
	@Test
	public void flipkarttest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Flipkart got opened",true);
		driver.quit();
		
	}
}
