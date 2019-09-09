package dataProviderHandling;

import org.testng.annotations.Test;

// we have to import 'TestDataOutSidePackage' for use
import selfCoding.TestDataOutsidePackage;

public class dataProviderDemo2 {

	// as 'TestData' is in same package so we don't have to import it.
	@Test(dataProvider = "inputs", dataProviderClass = TestData.class)
	public void test1(String input1, String input2) {
		System.out.println("Input 1 :" + input1);
		System.out.println("Input 2 :" + input2);
  }

// using a class from outside package
	@Test(dataProvider = "integerData", dataProviderClass = TestDataOutsidePackage.class)
	public void test2(int a, int b) {
		System.out.println("a :" + a + " b:" + b + " sum :" + (a + b));
	}

}
