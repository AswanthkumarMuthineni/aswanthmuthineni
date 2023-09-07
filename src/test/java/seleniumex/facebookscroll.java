package seleniumex;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookscroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//move the scroll
JavascriptExecutor jsc=(JavascriptExecutor)driver;
Thread.sleep(2000);
jsc.executeScript("window.scrollBy(0,4000);");
Thread.sleep(2000);
jsc.executeScript("window.scrollBy(0,-4000);");
	}

}
