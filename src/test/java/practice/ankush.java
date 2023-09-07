package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ankush {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();

driver.navigate().to("https://facebook.com/");
Thread.sleep(4000);
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println (title);

driver.navigate().to("https://amazon.com/");
Thread.sleep(4000);
driver.manage().window().maximize();
String title1=driver.getTitle();
System.out.println (title1);

driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();

driver.navigate().refresh();
driver.manage().window().maximize();
Thread.sleep(4000);

driver.close();
driver.quit();

	}

}
