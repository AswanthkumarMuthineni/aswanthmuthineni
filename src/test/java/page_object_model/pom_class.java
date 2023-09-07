package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class pom_class {
	
//declaration
	@FindBy(xpath ="//input[@id='username']")private WebElement untextbox;
	@FindBy(xpath ="//input[@type='password'][1]")private WebElement pwdtextbox;
	@FindBy(xpath ="//a[@id='loginButton']")private WebElement loginbtn;
	//initialization
	public pom_class() {
		
	}
	//Implementation
	public WebElement getUntextbox() {
		return untextbox;
	}
	public WebElement getPwdtextbox() {
		return pwdtextbox;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	

	

}
