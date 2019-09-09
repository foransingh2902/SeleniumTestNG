package selfCoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTestCases {
	SomeClassToTest ob;

	/*
	 * will run if test2 gets passed, and will run only after test2. But will only
	 * run after all the non dependent methods run
	 */
	@Test(dependsOnMethods = { "test2" })
	public void test1() {
		System.out.println("inside test 1");
	}

	@Test
	public void test2() {
		ob = new SomeClassToTest();
		int actualresult = ob.addNum(1, 2);
		Assert.assertEquals(actualresult, 3);
		System.out.println("inside test 2");
	}

	/*
	 * we can have multiples dependencies
	 * like @Test(dependsOnMethods={“test4”,”test1”}), then it will run only after
	 * test4 and test2
	 */
	@Test(dependsOnMethods = { "test4", "test1" })
	public void test3() {
		System.out.println("inside test 3");
	}

	@Test
	public void test4() {
		System.out.println("inside test 4");
  }


}
