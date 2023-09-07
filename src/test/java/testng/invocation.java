package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation {
@Test(invocationCount = 5)
public void show() {
	Reporter.log("hello",true);
}
}
