package TestNGDemo;

import org.testng.annotations.Test;

public class NewTestDemo2 {
	// this is called a Unit. it is associated with a annotation
	// by default every unit has a priority of 0 which is max.
	@Test(priority = 1)
	public void demo() {
		System.out.println("demo");
  }

// can have multiple @Test units
	@Test
	public void demo1() {
		System.out.println("demo1");
	}

// the parameter will stop this @Test from running.
	// another way is to remove @Test annotation, as TestNG will run only those
	// methods with have annotations above them.
	@Test(enabled = false)
	public void demo2() {
		System.out.println("demo2");
	}

	@Test
	public void demo3() {
		System.out.println("demo3");
	}
}
