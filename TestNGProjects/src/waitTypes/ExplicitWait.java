package waitTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExplicitWait {
	/*
	 * Waiting is having the automated task execution elapse a certain amount of
	 * time before continuing with the next step. You should choose to use Explicit
	 * Waits or Implicit Waits.
	 * 
	 * WARNING: Do not mix implicit and explicit waits! Doing so can cause
	 * unpredictable wait times. For example, setting an implicit wait of 10 seconds
	 * and an explicit wait of 15 seconds could cause a timeout to occur after 20
	 * seconds.
	 */
	WebDriver driver;
  @Test
	public void waitDemo() {
		driver.get("https://letskodeit.teachable.com/p/practice");
		// a[text()='Login'] won't work with <a> tag
		// don't need explicit wait with this element as its running after driver.get()
		// will will pass down control only after the page fully loads.
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		// visibilityOfElementLocated() takes a 'locator' as an input
		WebElement emailID = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_email']")));
		emailID.sendKeys("foran.singh2902@gmail.com");
		// driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("foran.singh2902@gmail.com");

  }
  @BeforeClass
  public void beforeClass() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
  }

}
