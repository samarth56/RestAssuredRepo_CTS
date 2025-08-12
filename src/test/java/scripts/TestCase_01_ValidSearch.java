package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.HomePage;
import pom.JacketPage;

public class TestCase_01_ValidSearch extends BaseClass{
	
	@Test
	public void testValidSearch() throws FileNotFoundException, IOException {
		HomePage homepage = new HomePage(driver, utilities);
		homepage.clickSearchBar();
		homepage.enterDetails(propertyFile.getData("ValidProductName"));
		homepage.clickBtn();
		
		JacketPage jacketpage = new JacketPage(driver, utilities);
		String actualheading  = jacketpage.getActualHeading();
		Assert.assertTrue(actualheading.contains("Jacket"), "Search result heading does not contain expected text.");
		
	}
	
}
