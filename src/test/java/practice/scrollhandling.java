package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;


public class scrollhandling {

	public static void main(String[] args) throws InterruptedException {


	
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
//move the scroll
JavascriptExecutor jsc=(JavascriptExecutor)driver;
Thread.sleep(2000);
jsc.executeScript("window.scrollBy(0,4000);");
Thread.sleep(2000);
jsc.executeScript("window.scrollBy(0,-4000);");

	}

}
