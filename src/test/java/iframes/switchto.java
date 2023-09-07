package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchto {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

//navigate to1st frame
driver.switchTo().frame(0);

//search any element store in ref var and print it
String data=driver.findElement(By.xpath("//a[text()='org.openqa.selenium'][1]")).getText();
System.out.println(data);
Thread.sleep(2000);

//main webpage
driver.switchTo().defaultContent();

//navigate the 2nd frame
driver.switchTo().frame(1);

//search andy element and print
String data1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations'][1]")).getText();
System.out.println(data1);
Thread.sleep(2000);

//MAIN  WEB PAGE
driver.switchTo().defaultContent();

//NAVIGATE TO 3RD FRAME
driver.switchTo().frame(2);

//SEARCH ELEMENT PRINT
String data2 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.log']")).getText();
System.out.println(data2);

	}

}
