package assertionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;


  @BeforeMethod
  public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
  }

	@Test
	public void uploading() {
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Dell\\Desktop\\1.jpg");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();

	}

  @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
  }

}
