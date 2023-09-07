package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontanins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
driver.findElement(By.xpath("//input[contains(@class,'textField pwdfield')]")).sendKeys("manager");
driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();

	}

}
