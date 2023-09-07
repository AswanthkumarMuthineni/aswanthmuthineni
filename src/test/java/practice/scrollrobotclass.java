package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollrobotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
//create the object of robot class
Robot r= new Robot();
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_PAGE_UP);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
