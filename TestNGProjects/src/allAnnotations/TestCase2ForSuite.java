package allAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2ForSuite {
  @Test
	public void testNumber1() {
		System.out.println("TestCase2ForSuit->Executing test1");
  }

	@Test
	public void testNumber2() {
		System.out.println("TestCase2ForSuit->Executing test2");
	}
  @BeforeMethod
  public void beforeMethod() {
		System.out.println("TestCase2ForSuit->Before Method");
  }

  @AfterMethod
  public void afterMethod() {
		System.out.println("TestCase2ForSuit->After Method");
  }

  @BeforeClass
  public void beforeClass() {
		System.out.println("TestCase2ForSuit->Before Class");
  }

  @AfterClass
  public void afterClass() {
		System.out.println("TestCase2ForSuit->After Class");
  }

}
