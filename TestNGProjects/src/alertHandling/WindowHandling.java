package alertHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver", currentDir +
		// "\\Drivers\\geckodriver.exe");
		// driver = new FirefoxDriver();
	}

	@Test
	public void newWindow1() throws InterruptedException {
		driver.get("file://E:/Selenium-Workspace/template_7/new_window.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		// HashSet<String> win = (HashSet<String>) driver.getWindowHandles();
		String pWindow = driver.getWindowHandle();
		System.out.println("pWindow " + pWindow);
		Set<String> win = driver.getWindowHandles();
		System.out.println(win);
		Iterator<String> it = win.iterator();
		String parent = it.next();
		System.out.println("Parent :" + parent);
		String child = it.next();
		System.out.println("Child" + child);
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[text()='Try Again']")).click();
		Thread.sleep(2000);
		// for another window
		// as we are handling multiple windows, therefore we use getWindowHandles()
		// with return type Set<string>
		// Another one getWindowHandle() is used to handle single window i.e. main
		// window
		// with return type string

// This not needed-> HashSet<String> win1 = (HashSet<String>)driver.getWindowHandles();
		Set<String> win1 = driver.getWindowHandles();
		Iterator<String> it1 = win1.iterator();
		String child2 = "";
		while (it1.hasNext()) {
			String string = (String) it1.next();
			if (!string.equals(pWindow)) {
				child2 = string;
			}
		}
		driver.switchTo().window(child2);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		// driver.close();

	}

  @AfterMethod
	public void afterMethod() throws InterruptedException {
		// Thread.sleep(2000);
		driver.close();
  }

}
