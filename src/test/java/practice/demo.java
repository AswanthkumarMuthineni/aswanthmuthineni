package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
	//WebDriver driver = new ChromeDriver();
		WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	String title=driver.getTitle();
	System.out.println (title);
	driver.quit();
   

	}

}
