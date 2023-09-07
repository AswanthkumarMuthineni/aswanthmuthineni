package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class id2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("aswanth");
driver.findElement(By.xpath("(//input)[10]")).sendKeys("muthineni");
driver.findElement(By.xpath("(//input)[11]")).sendKeys("9381097099");
driver.findElement(By.xpath("(//input)[13]")).sendKeys("Aswanth@55");   
//create droupdown
WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
Select s=new Select(day);
Thread.sleep(2000);
s.selectByVisibleText("1");

WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
Thread.sleep(2000);
Select ss=new Select(month);
Thread.sleep(2000);
ss.selectByVisibleText("Oct");
WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
Select sss=new Select(year);
Thread.sleep(2000);
sss.selectByVisibleText("1998");
driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//driver.quit();
}
}