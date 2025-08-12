package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtilities;

public class JacketPage {
	
	WebDriverUtilities utilities;
	
	// web elements
	
	@FindBy(xpath="//*[@id=\"shopify-section-template--24442064077088__main\"]/section/div[1]/div/h1")
	public WebElement actualHeading;
	
	@FindBy(xpath="//*[@id=\"facet-filters-form\"]/div/div[7]/button")
	public WebElement categoryBtn;

	@FindBy(xpath="//*[@id=\"facet-filter-filter.p.product_type\"]/div/div[1]/label")
	public WebElement boyCheckBox;
	
	@FindBy(xpath="//*[@id=\"facet-filters-form\"]/div/div[1]/button")
	public WebElement priceBtn;
	
	@FindBy(xpath="//*[@id=\"filter.v.price.gte\"]")
	public WebElement minRangeField;
	
	@FindBy(xpath="//*[@id=\"filter.v.price.lte\"]")
	public WebElement maxRangeField;
	
	@FindBy(xpath="//*[@id=\"facet-filters-form\"]/div/div[3]/button")
	public WebElement colorBtn;
	
	@FindBy(xpath="//*[@id=\"facet-filter-filter.p.m.custom.color\"]/div/div/div[3]/label")
	public WebElement blackColor;
	
	
	@FindBy(xpath="//*[@id=\"facet-filters-form\"]/div/div[13]/button")
	public WebElement AvailabilityBtn;
	
	@FindBy(xpath="//*[@id=\"filter.v.availability-1\"]")
	public WebElement inStockBox;
	
	@FindBy(xpath="//*[@id=\"facet-main\"]/product-list/div/product-item[1]")
	public WebElement productImg;
//	@FindBy(className="popover-button")
//	public WebElement sortBtn;
//	
//	@FindBy(xpath="//*[@id=\"sort-by-popover\"]/div/div/label[2]/span")
//	public WebElement lowToHigh;
	
	
	
	public JacketPage(WebDriver driver,WebDriverUtilities utilities ) {
		this.utilities = utilities;
		PageFactory.initElements(driver, this);
	}
	
	/// actions
	
	public void clickCategoryBtn() {
		categoryBtn.click();
	}
	
	public void tickBoyCheckBox() {
		boyCheckBox.click();
	}
	
	public void clickPriceBtn() {
		priceBtn.click();
	}
	
	public void enterPriceRange(String minPrice, String maxPrice) {
		minRangeField.sendKeys(minPrice);
		maxRangeField.sendKeys(maxPrice);
	}
	
	
	
	public void clickColorBtn() {
		colorBtn.click();
	}
	
	public void tickblackColor() {
		blackColor.click();
	}
	
	
	public void clickAvailabilityBtn() {
		AvailabilityBtn.click();
	}
	
	public void tickInStockBox() {
		inStockBox.click();
	}
	
	public void clickImg() {
		productImg.click();
	}
	
	public String getActualHeading() {
		return actualHeading.getText();
	}
	
//	public void clickSortBtn() {
//		sortBtn.click();
//	}
//	
//	public void clickLowToHigh() {
//		lowToHigh.click();
//	}
	
	
	
	
}
