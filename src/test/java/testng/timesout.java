package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timesout {
@Test(timeOut=5000)
public void login() {
	Reporter.log("i am log",true);
}
}
