package waitTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilityForExplicitWait {
	WebDriver driver;

	public WaitUtilityForExplicitWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("waiting for " + timeout + " seconds for element to appear");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("element appeared on webpage");

		} catch (Exception e) {
			System.out.println("element not appeared on webpage");
		}
		return element;
	}

	// won't be returning anything
	public void clickWhenReady(By locator, int timeout) {
		try {
			WebElement element = null;
			System.out.println("waiting for " + timeout + " seconds for element to be clickable");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("element clicked on webpage");

		} catch (Exception e) {
			System.out.println("element not appeared on webpage");
		}

	}
}
