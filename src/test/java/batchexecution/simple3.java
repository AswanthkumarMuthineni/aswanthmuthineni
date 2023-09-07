package batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class simple3 {
	public class simple1 {
		@Test
		public void testcase1() {
			Reporter.log("execut testcase1",true);
		}
		@Test
		public void testcase2() {
			Reporter.log("execut testcase2",true);
		}
		@Test 
		public void testcase3() {
			Reporter.log("execut testcase3",true);
		}
		}

}
