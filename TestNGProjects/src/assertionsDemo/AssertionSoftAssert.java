package assertionsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftAssert {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

  @Test
	public void titleFinder() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Start");
		driver.get("http://www.facebook.com");
		String actual = driver.getTitle();
		System.out.println("the name extracted is :" + actual);
		String expected = "Facebook – log in or sign u";
		// Assert works only for similar data types
		// assertEquals is a static method of Assert Class
		sa.assertEquals(actual, expected, "Titles don't match");
		System.out.println("End");
		// soft will run till end and won't give any error even if test fails.
		sa.assertAll();
		// so we run assertAll, this will assert all the tests

  }

  @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
  }

}
