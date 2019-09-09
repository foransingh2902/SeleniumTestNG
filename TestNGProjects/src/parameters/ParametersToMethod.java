package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersToMethod {
	WebDriver driver;
	String userName;
	int pwd;
	@BeforeMethod
	@Parameters({ "browser", "username", "password" })
	public void beforeMethod(String browserName, String username, int password) {
		userName = username;
		pwd = password;
		System.out.println("Browser is:" + browserName);
		String currentDir = System.getProperty("user.dir");
		if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", currentDir + "\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
			System.out.println("inside elseif");
		}
		else {
			// using default browser
			System.setProperty("webdriver.gecko.driver", currentDir + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("inside else");
		}

	}
	@Test
	public void test1() {
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Integer.toString(pwd));
  }

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		// closes current focused window
		driver.close();
		// This method is used to destroy the instance of WebDriver. It closes all
		// Browser Windows associated with that driver and safely ends the session
		// driver.quit();
	}
}
