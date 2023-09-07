package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class zamoto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
//move the scroll
JavascriptExecutor jsc=(JavascriptExecutor)driver;
Thread.sleep(2000);
jsc.executeScript("window.scrollBy(0,4000);");
Thread.sleep(2000);
jsc.executeScript("window.scrollBy(0,-4000);");

//WebElement str=driver.findElement(By.xpath("//button[@type='submit']"));

//driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("i phone");

//Thread.sleep(2000);
//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}