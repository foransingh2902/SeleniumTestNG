package dataProviderHandling;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo1 {
	// must provide the 'name' as it would be used by the calling test.
	// Data provider returns a two-dimensional JAVA object to the test method and
	// the test method, will invoke M times in a M*N type of object array.
	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] {
				{ "bmw", "m3" }, { "audi", "a6" }, { "benz", "c300" }
		};
	}

	// using 'dataProvider' attribute to receive inputs
	@Test(dataProvider = "inputs")
	public void test1(String input1, String input2) {
		System.out.print("Input 1 :" + input1);
		System.out.print(" Input 2 :" + input2 + "\n");
  }

	@DataProvider(name = "integerData")
	public Object[][] getIntData() {
		Object a[][] = new Object[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		return a;
	}

	@Test(dataProvider = "integerData")
	public void test2(int a, int b) {
		System.out.println("a :" + a + " b:" + b + " sum :" + (a + b));
	}

}
