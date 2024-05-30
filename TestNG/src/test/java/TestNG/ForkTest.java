package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ForkTest {

    @Test
    public void Execute() {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.purplle.com/");
    	Reporter.log("Purple got opened", true);
    	driver.quit();
    }
}
