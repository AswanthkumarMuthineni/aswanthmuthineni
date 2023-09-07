package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdoubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
WebElement wb=driver.findElement(By.xpath("//a[text()='Gmail']"));
Actions ac=new Actions(driver);
ac.moveToElement(wb).doubleClick().perform();
	}

}
