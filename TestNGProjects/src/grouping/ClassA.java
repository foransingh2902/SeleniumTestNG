package grouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassA {
// before and after class won't run as they don't belong to a group
	// if we want them to always run then we can add a attribute alwaysRun=true
	@BeforeClass(alwaysRun = true)
	public void beforeClassA() {
		System.out.println("Before Class");
	}

	@AfterClass(alwaysRun = true)
	public void AfterClassA() {
		System.out.println("After Class");
	}

	@Test(groups = { "regression" })
	public void testA1() {
		System.out.println("Executing testA1->regression");
  }

	@Test(groups = "smoke")
	public void testA2() {
		System.out.println("Executing testA2->smoke");
	}

	@Test(groups = "sanity")
	public void testA3() {
		System.out.println("Executing testA3->sanity");
	}

	@Test(groups = "configuration")
	public void testA4() {
		System.out.println("Executing testA4->configuration");
	}

	@Test(groups = "security")
	public void testA5() {
		System.out.println("Executing testA5->security");
	}

	@Test
	public void testA6() {
		System.out.println("Executing testA6");
	}


}
