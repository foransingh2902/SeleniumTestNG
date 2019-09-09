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

//can have multiple columns of data also
	@DataProvider(name = "integerData")
	public Object[][] getIntData() {
		Object a[][] = new Object[][] { { 1, 2, 10 }, { 3, 4, 11 }, { 5, 6, 12 } };
		return a;
	}

	@Test(dataProvider = "integerData")
	public void test2(int a, int b, int c) {
		System.out.println("a :" + a + " b:" + b + " c : " + c + " sum :" + (a + b + c));
	}

	@DataProvider(name = "Crossbrowser")
	public String[] getCredentials() {
		String[] browser = { "chrome", "firefox", "Internet Explorer" };
		return browser;
	}

	@Test(dataProvider = "Crossbrowser")
	public void test3(String data) {
		System.out.println("browser name is :" + data);
	}

}
