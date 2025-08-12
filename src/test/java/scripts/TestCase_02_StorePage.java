package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.HomePage;
import pom.StorePage;

public class TestCase_02_StorePage extends BaseClass {
	
	
	
	@Test
	public void testStoreBtn() throws InterruptedException {
		HomePage homepage = new HomePage(driver, utilities);
		StorePage storepage= new StorePage(driver, utilities);
		
		homepage.clickOurStoreBtn();
		Thread.sleep(2000);
		String actualText = storepage.getStoreHeading();
		
		Assert.assertTrue(actualText.contains("Store"), "the page heading doesn't contain store word");
		
	}
}
