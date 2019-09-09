package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {
	@Test
	@Parameters("var")
	public void parameterReceiver(String data) {
		System.out.println("value passed from the suite file is :" + data);
  }
}
