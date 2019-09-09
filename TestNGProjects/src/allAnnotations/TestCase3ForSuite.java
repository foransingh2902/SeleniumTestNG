package allAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseSuit.BeforeAndAfterSuit;

public class TestCase3ForSuite extends BeforeAndAfterSuit {
  @Test
	public void testNumber1() {
		System.out.println("TestCase3ForSuit->Executing test1");
  }

	@Test
	public void testNumber2() {
		System.out.println("TestCase3ForSuit->Executing test2");
	}
  @BeforeMethod
  public void beforeMethod() {
		System.out.println("TestCase3ForSuit->Before Method");
  }

  @AfterMethod
  public void afterMethod() {
		System.out.println("TestCase3ForSuit->After Method");
  }

  @BeforeClass
  public void beforeClass() {
		System.out.println("TestCase3ForSuit->Before Class");
  }

  @AfterClass
  public void afterClass() {
		System.out.println("TestCase3ForSuit->After Class");
  }

}
