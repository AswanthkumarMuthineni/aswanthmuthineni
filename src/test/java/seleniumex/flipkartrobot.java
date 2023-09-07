package seleniumex;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartrobot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
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
