package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class chlid_browser_popup {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("moblies");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
}
