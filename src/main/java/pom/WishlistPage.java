package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
		public WebDriver driver;
		
		@FindBy(xpath="//h1[contains(text(),'Wishlist')]")
		public WebElement wishlistHeading;
		
		public WishlistPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public String getWishlistHeading() {
			return wishlistHeading.getText();
		}
}
