package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotations_flow {
@BeforeSuite
public void m1() {
	Reporter.log("==connection to database==",true);
	
}
@BeforeClass
public void m2() {
	Reporter.log("==open the browser==",true);
}
@BeforeMethod
public void m3() {
	Reporter.log("==login application",true);
}
@Test
public void t1() {
	Reporter.log("== i am main tast case",true);
}
@AfterMethod
public void m4() {
	Reporter.log("==log out the appllication",true);
}
@AfterClass
public void m5() {
	Reporter.log("==close the browser==",true);
}
@AfterSuite
public void m6() {
	Reporter.log("==disconnect the data base",true);
}
}
