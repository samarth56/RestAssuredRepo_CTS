package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtilities;

public class StorePage {
	
	WebDriverUtilities utilities;
	
	@FindBy(xpath="//h1[text()='Find a Store']")
	public WebElement storeHeading;
	
	public StorePage(WebDriver driver, WebDriverUtilities utilities) {
		this.utilities =  utilities;
		PageFactory.initElements(driver, this);
	}
	
	public String getStoreHeading() {
		return storeHeading.getText();
	}

}
