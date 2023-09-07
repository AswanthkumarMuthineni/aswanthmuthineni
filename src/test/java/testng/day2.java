package testng;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class day2 {
@Test
public void loginactivetime() throws Exception
{
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
	driver.findElement(By.xpath("(//div)[13]")).click();
	
	Thread.sleep(2000);
	driver.quit();
}
@Test
public void tasks() throws Exception
{
WebDriver driver=new EdgeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
driver.findElement(By.className("content tasks"));
Thread.sleep(2000);

driver.quit();
}
}
