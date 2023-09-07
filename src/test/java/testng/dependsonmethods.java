package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethods {

	@Test
	public void login() {
		Reporter.log(null);
	}
}
