package batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class simple2 {
	public class simple1 {
		@Test
		public void test1() {
			Reporter.log("execut test1",true);
		}
		@Test
		public void test2() {
			Reporter.log("execut test2",true);
		}
		@Test 
		public void test3() {
			Reporter.log("execut test3",true);
		}
		}

}
