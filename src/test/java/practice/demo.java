package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
	//WebDriver driver = new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000))	;
	driver.get("https://www.amazon.in");
	String title=driver.getTitle();
	System.out.println (title);
	driver.quit();
   

	}

}
