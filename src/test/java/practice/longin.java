package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class longin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
//enter vaild usernamr
driver.findElement(By.id("username")).sendKeys("admin");
//enter valid password
driver.findElement(By.name("pwd")).sendKeys("manager");
//check box
driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
//enter login botten

driver.findElement(By.id("loginButton")).click();

	}

}
