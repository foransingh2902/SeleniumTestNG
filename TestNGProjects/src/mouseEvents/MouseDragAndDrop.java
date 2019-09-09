package mouseEvents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseDragAndDrop {
	WebDriver driver;
  @Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("https://www.aspsnippets.com/demos/742/");
		WebElement src = driver.findElement(By.xpath("//div[@id='dvSource']/img[1]"));
		WebElement dst = driver.findElement(By.xpath("//div[@id='dvDest']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst);
		act.build().perform();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		// repeating same action
		WebElement src1 = driver.findElement(By.xpath("//div[@id='dvSource']/img[2]"));
		WebElement dst1 = driver.findElement(By.xpath("//div[@id='dvDest']"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(src1, dst1);
		act1.build().perform();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		Thread.sleep(2000);
  }

	@BeforeClass
  public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

	@AfterClass
  public void afterMethod() {
		// driver.close();
  }

}
