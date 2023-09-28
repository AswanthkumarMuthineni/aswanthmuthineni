package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class notifaction_popup {
	

		public static void main(String[] args) throws Throwable {
			// TODO Auto-generated method stub
		System.setProperty("C:\\Program Files\\Mozilla Firefox\\firefox.exe", "Firefox");	
	//ChromeOptions c=new ChromeOptions();
EdgeOptions c=new EdgeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("start-maximized");
	WebDriver driver=new EdgeDriver();
	Thread.sleep(2000);
	driver.get("https://www.hdfc.com");

		}

	}


