package waitTypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImplicitWait {
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
	@BeforeClass
	public void beforeClass() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		/*
		 * As we have set the implicit time here (By default it is zero) so for every
		 * 'WebElement' we trying to find out, if it wasn't found in the first attempt
		 * then driver will wait for 3 seconds before trying again, instead of giving an
		 * exception of ElementNotFound right away. It means that 'driver' will try
		 * twice to find the WebElement before throwing the exception.
		 */
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// the test will fail if we remove this wait as page won't load in time.
	}
  @Test
	public void WaitDemo() throws InterruptedException {
		/*
		 * driver.get() will wait till the page loads completely, and only after that
		 * rest of the commands after this will run. So we don't have to worry regarding
		 * wait in this case. But this is not applicable for rest. So, we use implicit
		 * and explicit waits.
		 */
		driver.get("https://letskodeit.teachable.com/p/practice");
		// a[text()='Login'] won't work with <a> tag
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		// the implicit wait we provide will be applicable to every WebElement we trying
		// to find.
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("foran.singh2902@gmail.com");

  }

  @AfterClass
	public void afterClass() throws InterruptedException {
		// Thread.sleep(2000);
		driver.quit();
  }

}
