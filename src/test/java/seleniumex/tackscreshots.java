package seleniumex;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class tackscreshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
TakesScreenshot ts=(TakesScreenshot)driver;
File sr=ts.getScreenshotAs(OutputType.FILE);
File dse=new File("C:\\Users\\aswanth\\Desktop\\testing screenshorts\\.flipkart.png");
Files.copy(sr, dse);
	}

}
