package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFrameDragAndDrop {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
  @Test
	public void frameTest() throws InterruptedException {
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		// using string argument- can take both name or ID
		driver.switchTo().frame(driver.findElement(By.xpath("//div/div[1]/p/iframe[@class='demo-frame']")));
		WebElement src = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement dst = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst);
		act.build().perform();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();


  }


  @AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
  }

}
