package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;	

public class actionsclassdraganddrop {
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//write xpath for source element
		WebElement srcelement = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
        //Write xpath for target element
		WebElement destelement = driver.findElement(By.xpath("//div[@id='droppable']"));
		//use drag and drop method
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, destelement).perform();
		
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement  destelement1= driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
        //Write xpath for target element
		WebElement  srcelement1= driver.findElement(By.xpath("//div[@id='draggable']"));
		//use drag and drop method
		Actions act1=new Actions(driver);
	
		act1.dragAndDrop(destelement1, srcelement1).perform();
	}

}
