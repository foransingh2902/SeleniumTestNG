package TestNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestDemo3 {

	@Test
	public void demo() {
		System.out.println("demo");
  }

	@Test
	public void demo1() {
		System.out.println("demo1");
	}

// @BeforeMethod and @AfterMethod will run with both tests individually
	@AfterMethod
	public void am() {
		System.out.println("after method");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("before method");
	}

}
