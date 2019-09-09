package waitTypes;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//must import this
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWaitDemo {
	WebDriver driver;
  @Test
  public void f() {
		/*
		 * The fluent wait is used to tell the web driver to wait for a condition, as
		 * well as the frequency with which we want to check the condition before
		 * throwing an "ElementNotVisibleException" exception
		 */
		driver.get("https://letskodeit.teachable.com/p/practice");

		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

		// This one is Deprecated for version 3.11 or above-
		/*
		 * Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(30,
		 * TimeUnit.SECONDS) .pollingEvery(5,
		 * TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		 */
		/*
		 * Frequency is set to 5 seconds and the maximum time is set to 30 seconds. Thus
		 * this means that it will check for the element on the web page at every 5
		 * seconds for the maximum time of 30 seconds. If the element is located within
		 * this time frame it will perform the operations else it will throw an
		 * "Exception" you specified
		 */
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		/*
		 * java.util.function.Function<WebDriver, WebElement>. Represents a function
		 * that accepts one argument and produces a result.
		 */
		WebElement emailID = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@id='user_email']"));
			}
		});
		emailID.sendKeys("foran.singh2902@gmail.com");
  }
  @BeforeMethod
  public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
  }

}
