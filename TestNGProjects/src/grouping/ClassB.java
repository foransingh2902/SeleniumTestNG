package grouping;

import org.testng.annotations.Test;

public class ClassB {
	@Test(groups = "regression")
	public void testB1() {
		System.out.println("Executing testB1->regression");
  }

	@Test(groups = "smoke")
	public void testB2() {
		System.out.println("Executing testB2->smoke");
	}

	@Test(groups = "sanity")
	public void testB3() {
		System.out.println("Executing testB3->sanity");
	}

	@Test(groups = "configuration")
	public void testB4() {
		System.out.println("Executing testB4->configuration");
	}

	@Test(groups = "security")
	public void testB5() {
		System.out.println("Executing testB5->security");
	}

	@Test
	public void testB6() {
		System.out.println("Executing testB6");
	}


}
