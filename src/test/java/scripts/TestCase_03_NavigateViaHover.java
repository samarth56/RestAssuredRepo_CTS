package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.HomePage;
import pom.SneakerPage;

public class TestCase_03_NavigateViaHover extends BaseClass {

	
	@Test
	public void testNavigationViaHover() throws InterruptedException {
		HomePage homepage = new HomePage(driver, utilities);
		homepage.hoverFootWare(driver,utilities );
		Thread.sleep(2000);
		homepage.clickSneakers();
		
		SneakerPage sp = new SneakerPage(driver);
		String actualHeading = sp.getSneakerHeading();
		
		Assert.assertTrue(actualHeading.contains("Sneakers"), "this is not sneaker page");
		
	}
}
