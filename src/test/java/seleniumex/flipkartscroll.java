package seleniumex;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartscroll {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver d=new ChromeDriver();
d.get("https://www.flipkart.com/");
JavascriptExecutor j=(JavascriptExecutor)d;
Thread.sleep(2000);
j.executeScript("window.scrollBy(0,4000)");
Thread.sleep(2000);
j.executeScript("window.scrollBy(0,-4000)");
	}

}
