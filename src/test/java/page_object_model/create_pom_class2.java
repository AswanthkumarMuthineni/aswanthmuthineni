package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class create_pom_class2 {
	
	//declaration
	@FindBy(xpath = "//input[@class='inputtext _58mg _5dba _2ph-']")private WebElement firstnametetextbox;
	@FindBy(xpath = "//input)[10]")private WebElement surnametextbox;
	@FindBy(xpath = "//input)[11]")private WebElement mobilenumbertextbox;
	@FindBy(xpath = "//input)[13]")private WebElement newpasswordtextbox;
	
	
	//initialization
	public create_pom_class2(){
		
	}
	//Implementation

	public WebElement getFirstnametetextbox() {
		return firstnametetextbox;
	}

	public WebElement getSurnametextbox() {
		return surnametextbox;
	}

	public WebElement getMobilenumbertextbox() {
		return mobilenumbertextbox;
	}

	public WebElement getNewpasswordtextbox() {
		return newpasswordtextbox;
	}


	}
	
	

