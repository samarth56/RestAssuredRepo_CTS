package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.HomePage;
import pom.WishlistPage;

public class TestCase_04_NavigateToWishListPage extends BaseClass{

		@Test
		public void testNavigateToWishlistPage() {
			HomePage homepage = new HomePage(driver, utilities);
			homepage.clickWishlistBtn();
			
			WishlistPage wp = new WishlistPage(driver);
			String actualHeading = wp.getWishlistHeading();
			
			Assert.assertTrue(actualHeading.contains("Wishlist"), "this is not wishlist page");

			
		}
}
