package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_false {
@Test
public void login() {
	Reporter.log("i am log",true);
	Assert.fail();
}
	@Test(enabled=false)
	public void logout() {
		Reporter.log("i am logout",true);
	}


}
