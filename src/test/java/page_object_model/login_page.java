package page_object_model;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	
	//declaration
	
	@FindBy(xpath="//input[@id='username']")private WebElement untextbox;
	@FindBy(xpath = "//input[@type='password'][1]")private WebElement pwdtextbox;
	@FindBy(xpath = "//a[@id='loginButton']")private WebElement loginbut;
	
	
	//initialization
	
	
	public login_page(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	
		//Implementation
		
		
	
	public WebElement getUntextbox() {
		return untextbox;
	}
	public WebElement getPwdtextbox() {
		return pwdtextbox;
	}
	public WebElement getLoginbut() {
		return loginbut;
	}
	
}
