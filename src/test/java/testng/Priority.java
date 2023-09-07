package testng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority =3 )
public void demo() {
	
	Reporter.log("hello",true);
}
@Test(priority =2)
public void demo1() {
	Reporter.log("ram",true);
	
}
@Test(priority = 1)
public void demo3() {
	Reporter.log("rama",true);
	
}
}
