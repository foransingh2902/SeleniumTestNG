package alertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class alertWithChrome {
	WebDriver driver;

	@BeforeClass
	public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver", currentDir +
		// "\\Drivers\\geckodriver.exe");
		// driver = new FirefoxDriver();
	}

	@Test
	public void alert1() throws InterruptedException {
		driver.get("file://E:/Selenium-Workspace/template_7/alerts.html");
		driver.findElement(By.xpath("//input[@type='button' ][@value='Alert Box']")).click();
		// Alert are not made in HTMl, they are made in java script
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
	}

//(enabled = false)
	@Test
	public void alert2() throws InterruptedException {
		driver.get("file://E:/Selenium-Workspace/template_7/alerts.html");
		driver.findElement(By.xpath("//input[@type='button' ][@value='Confirm Box']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.dismiss();
	}

//(enabled = false)
	@Test
	public void alert3() throws InterruptedException {
		// this one wasn't working on Chrome. So we used Firefox.
		driver.get("file://E:/Selenium-Workspace/template_7/alerts.html");
		driver.findElement(By.xpath("//input[@type='button' ][@value='PromptBox']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("Hello");
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
  }


	@AfterClass
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
  }

}
