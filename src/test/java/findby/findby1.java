package findby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class findby1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
driver.get("https://www.amazon.in");
WebElement textbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
driver.navigate().refresh();
textbox.sendKeys("mobiles under 20000");
	}

}
