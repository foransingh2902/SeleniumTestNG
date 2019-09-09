package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstScript {
	WebDriver driver;
	@BeforeMethod
	public void beforeMain() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
  @Test
	public void mainScript() throws InterruptedException {
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("foran.singh2902@gmail.com");
		// use your valid password with ID
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2703072@f12");
		driver.findElement(By.xpath("//form[@id='login_form']")).submit();
		Thread.sleep(5000);
	}

	@Test
	public void mainScript1() throws InterruptedException {
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("foran.singh2902@gmail.com");
		// use your valid password with ID
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("*****");
		driver.findElement(By.xpath("//form[@id='login_form']")).submit();
		Thread.sleep(10000);
	}

	@AfterMethod
	public void afterMain() {
		driver.close();

  }
}
