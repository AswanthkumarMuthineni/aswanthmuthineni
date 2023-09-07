package seleniumex;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlerobot {

	public static void main(String[] args) throws Exception {
		//  TODO Auto-generated method stub
WebDriver d=new ChromeDriver();
d.get("https://www.google.com/");
d.findElement(By.xpath("//textarea[@type='search']")).sendKeys("selenium");
d.findElement(By.xpath("//div[@class='CcAdNb']")).submit();
		
Robot r=new Robot();
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_DOWN );
Thread.sleep(2000);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_UP);
Thread.sleep(2000);
r.keyRelease(KeyEvent.VK_UP);


	}

}
