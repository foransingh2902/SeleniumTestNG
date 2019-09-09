package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseEventsDemo1 {
	WebDriver driver;

//Note: Don't use mouse while executing test containing actions class
	@BeforeMethod
	public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void newMouseEvent() throws InterruptedException {
		driver.get("file:///E:/Selenium-Workspace/template_7/nested_menus.html#");
		Thread.sleep(2000);
		// Actions class takes 'driver' as input
		Actions act = new Actions(driver);
		// take WebElement as input
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Projects']")));
		act.build().perform();
		Thread.sleep(2000);
		// can also use
		// act.moveToElement(driver.findElement(By.xpath("//a[@title='Homepage']"))).build().perform();
		// can also use separately
		// act.build();
		// or act.perform();
		// build will build the action and perform() will perform that one on the screen
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Older projects']")));
		act.build().perform();
		Thread.sleep(2000);


	}

  @AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.close();
  }

}
