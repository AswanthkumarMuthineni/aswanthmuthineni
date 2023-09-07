package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class testng2 {
	@Test
	
public void demo() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void demo2() {
	WebDriver  driver=new EdgeDriver()	;
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.close();
	}
}
