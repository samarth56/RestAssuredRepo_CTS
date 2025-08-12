package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtilities;

public class ProductPage {
	
	WebDriverUtilities utilities;

	@FindBy(xpath="//*[@id=\"shopify-section-template--24442063913248__main\"]/section/div/div[1]/product-media/flickity-controls/scroll-shadow/div/div/button[2]/div")
	public WebElement productthumb;
	
	@FindBy(id="AddToCart")
	public WebElement addToCartBtn;
	
	public ProductPage(WebDriver driver, WebDriverUtilities utilities) {
		this.utilities = utilities;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickImg() {
		productthumb.click();
	}
	
	public void addToCart() {
		addToCartBtn.click();
	}
	
}
