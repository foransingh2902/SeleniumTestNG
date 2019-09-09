package selfCoding;

import org.testng.annotations.DataProvider;

public class TestDataOutsidePackage {
	// must provide the 'name' as it would be used by the calling test
	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] {
				{ "bmw", "m3" }, { "audi", "a6" }, { "benz", "c300" }
		};
	}

	@DataProvider(name = "integerData")
	public Object[][] getIntData() {
		Object a[][] = new Object[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		return a;
	}



}
