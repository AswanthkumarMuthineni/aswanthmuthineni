package practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setpositon {
	public static <webdrivier> void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Point d=new Point(300,200);
		driver.manage().window().setPosition(d);
		driver.close();
		
	}


}
