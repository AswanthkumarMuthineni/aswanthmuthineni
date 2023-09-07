package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
//Enter the valves in text page
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles under 20000 ");
//click search butten
driver.findElement(By.id("nav-search-submit-button")).click();

driver.close();
	}

}
