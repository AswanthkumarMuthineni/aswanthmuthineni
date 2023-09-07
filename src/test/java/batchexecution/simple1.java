package batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class simple1 {
@Test
public void tc1() {
	Reporter.log("execut tc1",true);
}
@Test
public void tc2() {
	Reporter.log("execut tc2",true);
}
@Test 
public void tc3() {
	Reporter.log("execut tc3",true);
}
}
