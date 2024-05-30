package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ForkTest {
	WebDriver driver;
    @Test(groups = "Regresion")
    public void Execute() {
    	driver = new ChromeDriver();
    	driver.get("https://www.purplle.com/");
    	Reporter.log("Purple got opened", true);
    	driver.quit();
    }
    
    @Test(groups = "Regresion") 
    public void secondTest() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    Reporter.log("DemoWebshop got opened",true);
    driver.quit();
    }
}
