package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.id("identifierId")).sendKeys("muthineniaswanth@gmail.com");
driver.findElement(By.id("identifierNext")).click();
driver.findElement(By.id("next")).click();
Thread.sleep(4000);
//driver.close();

//Thread.sleep(4000);
//driver.findElement(By.partialLinkText("Im")).click();

	}

}
