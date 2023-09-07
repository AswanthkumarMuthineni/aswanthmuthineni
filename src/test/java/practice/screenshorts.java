package practice;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class screenshorts {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.in");
//Random rc=new Random();
//int rcm=rc.nextInt(10);

WebElement we=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
TakesScreenshot e=(TakesScreenshot)driver;
File src=we.getScreenshotAs(OutputType.FILE);
File desc = new File("C:\\Users\\aswanth\\Desktop\\testing screenshorts\\google.png");
Files.copy(src, desc);



	}

}
