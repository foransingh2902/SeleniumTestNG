package baseSuit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

// ctrl+shift+o  -> removes unwanted imports
public class BeforeAndAfterSuit {
// @BeforeTest and //@AfterTest will run before the and after every <Test> tag in the xml file.
// So its better to use it in a different Suit file to use it as a common
// annotation to be run for every <Test> tag sequence, which itself contains a number
// of classes with further contains a number of @Test cases inside them.
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeAndAfterSuit-> Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("BeforeAndAfterSuit-> After Test");
	}
  @BeforeClass
	public void beforeClassOfSuit() {
		System.out.println("BeforeAndAfterSuit-> Before Class");
  }

  @AfterClass
	public void afterClassofSuit() {
		System.out.println("BeforeAndAfterSuit-> After Class");
  }

  @BeforeSuite
  public void beforeSuite() {
		System.out.println("BeforeAndAfterSuit-> Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
		System.out.println("BeforeAndAfterSuit-> After Suite");
  }

}
