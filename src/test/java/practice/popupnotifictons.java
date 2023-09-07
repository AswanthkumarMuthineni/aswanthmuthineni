package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class popupnotifictons {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	System.setProperty("C:\\Program Files\\Mozilla Firefox\\firefox.exe", "Firefox");	
ChromeOptions c=new ChromeOptions();

c.addArguments("--disable-notifications");
c.addArguments("start-maximized");
WebDriver driver=new FirefoxDriver();
Thread.sleep(2000);
driver.get("https://www.hdfc.com");

	}

}
