//package scripts;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import genericLibraries.BaseClass;
//import pom.HomePage;
//import pom.JacketPage;
//import pom.ProductPage;
//
//public class JacketPageTest extends BaseClass{
//		
//	public JacketPage jacketpage;
//	public HomePage homepage;
//	public ProductPage productpage;
//	
//	
//	@BeforeClass
//	public void initPages() throws IOException {
//	    homepage = new HomePage(driver, utilities);
//	    jacketpage = new JacketPage(driver, utilities);
//	    productpage = new ProductPage(driver, utilities);
//	    
//
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	    // Wait for search bar to be visible and clickable
//	    wait.until(ExpectedConditions.elementToBeClickable(homepage.searchBar));
//	    homepage.clickSearchBar();
//
//	    // Wait for search input field to be visible
//	    wait.until(ExpectedConditions.visibilityOf(homepage.inputField));
//	    homepage.enterDetails(propertyFile.getData("product")); // e.g., "jacket"
//
//	    // Wait for the search button to be clickable
//	    wait.until(ExpectedConditions.elementToBeClickable(homepage.ResultBtn));
//	    homepage.clickBtn();
//	}
//
//	
//	
//	
//	@Test(priority=1)
//	public void testCategory() {
//		jacketpage.clickCategoryBtn();
//		jacketpage.tickBoyCheckBox();
//		
//	}
//	
//	
//	@Test(priority=2)
//	public void testSlider() throws FileNotFoundException, IOException {
//		jacketpage.clickPriceBtn();
//		jacketpage.enterPriceRange(propertyFile.getData("minPrice"), propertyFile.getData("maxPrice"));
//		
//	}
//	
//	
//	@Test(priority=3)
//	public void testColor() throws FileNotFoundException, IOException {
//		
//		jacketpage.clickColorBtn();
//		jacketpage.tickblackColor();
//		
//	}
//	
//	@Test(priority=4)
//	public void testAvailability() throws FileNotFoundException, IOException {
//		jacketpage.clickAvailabilityBtn();
//		jacketpage.tickInStockBox();
//		
//	}
//	
//
//	@Test(priority=5)
//	public void testProductImg() {
//		jacketpage.clickImg();
//	}
//	
//	@Test(priority=6)
//	public void testThumbImg() {
//		productpage.clickImg();
//	}
//	
//	@Test(priority=7)
//	public void testAddToCart() {
//		productpage.addToCart();
//	}
//	
//}
