package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com/");

driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.xpath("//a[text()='Login']")).click();
driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("9381097099");
	}

}
