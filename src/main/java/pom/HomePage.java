package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericLibraries.WebDriverUtilities;

public class HomePage {

		WebDriverUtilities utilites;
		WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"shopify-section-sections--24442057392416__header\"]/store-header/div/div/div[2]/div/a[1]")
		public WebElement searchBar;
		
		@FindBy(name="q")
		public WebElement inputField;
				
		@FindBy(xpath="//*[@id=\"search-drawer\"]/footer/button")
		public WebElement ResultBtn;
		
		@FindBy(linkText="Our Store")
		public WebElement ourStoreBtn;
		
		@FindBy(xpath="//a[text()='Footwear']")
		public WebElement FootWareLink;
		
		@FindBy(xpath="//a[text()='Sneakers']")
		public WebElement SneakersLink;
		
		@FindBy(xpath="//span[contains(text(),'Wishlist')]")
		public WebElement WishlistBtn;
		
		@FindBy(xpath="//span[contains(text(),'All rights reserved')]")
		public WebElement footerText;
		
		public HomePage(WebDriver driver,WebDriverUtilities utilites ) {
			this.utilites = utilites;
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void clickSearchBar() {
			searchBar.click();
		}
		
		public void enterDetails(String data) {
			inputField.sendKeys(data);
		}
		
		public void clickBtn() {
			ResultBtn.click();
		}
		
	


		public void clickOurStoreBtn() {
			// TODO Auto-generated method stub
			ourStoreBtn.click();
		}
		
		public void hoverFootWare(WebDriver driver,WebDriverUtilities utilites ) {
			utilites.mouseHover( driver, FootWareLink);	
		}
		
		public void clickSneakers() {
			SneakersLink.click();
		}
		
	
		public void clickWishlistBtn() {
			// TODO Auto-generated method stub
			WishlistBtn.click();

		}
		
		public void scrollTOFooterText() throws InterruptedException {
			utilites.scroll(driver, footerText);
			Thread.sleep(2000);
			Assert.assertTrue(footerText.isDisplayed(), "footer text is not visible");
		}
		
}
