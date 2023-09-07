package practice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsizee {
	public static <webdrivier> void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Dimension d=new Dimension(100,500);
		driver.manage().window().setSize(d);
		driver.quit();
		
	}

}
