package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclassrightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000))	;
driver.get("https://www.google.com");
WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
Actions ac=new Actions(driver);
ac.moveToElement(gmail).contextClick(gmail).perform();	
	}

}
