package assertionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AutoLogin {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void titleFinder() throws InterruptedException {
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("foran.singh2902@gmail.com");
		// use your valid password with ID
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2703072@f1");
		driver.findElement(By.xpath("//form[@id='login_form']")).submit();
		Thread.sleep(5000);
		WebElement wb = driver.findElement(By.xpath("//span[text()='Foran']"));
		String actual = wb.getText();
		// use your name as displayed in your FaceBook account
		System.out.println("name is:" + actual);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, "Foran");
		sa.assertAll();

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
