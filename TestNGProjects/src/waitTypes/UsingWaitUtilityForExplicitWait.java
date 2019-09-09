package waitTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UsingWaitUtilityForExplicitWait {

	WebDriver driver;
	WaitUtilityForExplicitWait wt;
  @Test
	public void waitDemo() {
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		WebElement email = wt.waitForElement(By.xpath("//input[@id='user_email']"), 3);
		email.sendKeys("foran.singh2902@gmail.com");
		wt.clickWhenReady(By.name("commit"), 3);

  }
  @BeforeClass
  public void beforeClass() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wt = new WaitUtilityForExplicitWait(driver);
  }

  @AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
  }

}
