package iFrameHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFrameDemo1 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
  @Test
	public void frameTest() throws InterruptedException {
		driver.get("file://E:/Selenium-Workspace/template_7/iframes.html");
		// using string argument- can take both name or ID
		driver.switchTo().frame("iframebasic1");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Foran Singh");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		/*
		 * Note: we can't switch directly from one frame to another. We must first come
		 * back to the parent frame by using- driver.switchTo().defaultContent();
		 * 
		 * taking int as argument. The numbering starts from index 0. So this will be
		 * switching to the second frame of the page.
		 */
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		// will switch back to default content, which is always parent window
		driver.switchTo().defaultContent();
		// taking WebElement as argument
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='IF1']")));
		driver.findElement(By.xpath("//input[@id='mail']")).sendKeys("foran.singh2902@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
  }


  @AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
  }

}
