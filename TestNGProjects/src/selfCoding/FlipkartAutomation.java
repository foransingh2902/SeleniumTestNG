package selfCoding;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartAutomation {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
  @Test
	public void frameTest() throws InterruptedException {
		driver.get("https://www.flipkart.com/");

		// driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Foran
		// Singh");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone x");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		System.out.println("handles have :" + handles.size());
		String nextTab = "";
		while (it.hasNext()) {
			String string = (String) it.next();
			if (!string.equals(parent)) {
				nextTab = string;
			}

		}
		System.out.println("next Tab :" + nextTab + " parent tab :" + parent);
		Thread.sleep(2000);

  }


  @AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
  }

}
