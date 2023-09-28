package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

@Test
public class multibroswing2 {
	@Parameters("Browsername")
public void m1(String Browsername ) {
	WebDriver driver=null;
	if(Browsername.equals("Edgedriver")) {
		driver=new EdgeDriver();
	}
	else if (Browsername.equals("firefox")) {
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	}
		

}
}
