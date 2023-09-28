package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hardassert {
@Test
public void tc1() {
	System.out.println("before fail tc1");
	Assert.fail();
	Reporter.log("After fail tc1 ",true);
	System.out.println("before fail tc2");
	System.out.println("before fail tc3");
	System.out.println("before fail tc4");
}


}
