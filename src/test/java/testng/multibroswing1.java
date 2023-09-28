package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class multibroswing1 {
@Test
public void m1() {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");
}
}
