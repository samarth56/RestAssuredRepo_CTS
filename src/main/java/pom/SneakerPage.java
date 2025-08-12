package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SneakerPage {
	
	@FindBy(xpath="//h1[contains(text(),'Sneaker')]")
	public WebElement sneakerHeading;
	
	 public SneakerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	 public String getSneakerHeading() {
		 return sneakerHeading.getText();
	 }
}
