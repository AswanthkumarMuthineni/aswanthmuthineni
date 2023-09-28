package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ankush {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
WebDriver driver =new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000))	;
driver.navigate().to("https://facebook.com/");

driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println (title);

driver.navigate().to("https://amazon.com/");

driver.manage().window().maximize();
String title1=driver.getTitle();
System.out.println (title1);

driver.navigate().back();

driver.navigate().forward();

driver.navigate().refresh();
driver.manage().window().maximize();


driver.close();
driver.quit();

	}

}
