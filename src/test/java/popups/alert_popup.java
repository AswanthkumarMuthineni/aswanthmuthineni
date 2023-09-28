package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert_popup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert art=driver.switchTo().alert();
		//art.accept();
		art.dismiss();
		//String text=driver.switchTo().alert().getText();
		//System.out.println(text);
	}
}
