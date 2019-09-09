package assertionsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionHardAssert {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

  @Test
	public void titleFinder() {
		System.out.println("Start");
		driver.get("http://www.facebook.com");
		String actual = driver.getTitle();
		System.out.println("the name extracted is :" + actual);
		String expected = "Facebook – log in or sign u";
		// Assert works only for similar data types
		// assertEquals is a static method of Assert Class
		Assert.assertEquals(actual, expected);
		System.out.println("End");
		// Drawback of hard assertion is that if it fails then lines after that won't
		// work. To overcome this limitation we need soft assert

  }

  @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
  }

}
