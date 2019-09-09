package grouping;

import org.testng.annotations.Test;

public class ClassC {
	@Test(groups = "regression")
	public void testC1() {
		System.out.println("Executing testC1->regression");
  }

	@Test(groups = "smoke")
	public void testC2() {
		System.out.println("Executing testC2->smoke");
	}

	@Test(groups = "sanity")
	public void testC3() {
		System.out.println("Executing testC3->sanity");
	}

	@Test(groups = "configuration")
	public void testC4() {
		System.out.println("Executing testC4->configuration");
	}

	@Test(groups = "security")
	public void testC5() {
		System.out.println("Executing testC5->security");
	}

// this will run for both either smoke or sanity. If we specifically exclude any of these
	// then it won't run
	@Test(groups = { "smoke", "sanity" })
	public void testC6() {
		System.out.println("Executing testC6->smoke and sanity");
	}


}
