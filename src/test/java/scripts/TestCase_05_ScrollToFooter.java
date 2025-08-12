package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.HomePage;

public class TestCase_05_ScrollToFooter extends BaseClass {
	
	@Test
	public void textFooterText() throws InterruptedException {
		HomePage hp = new HomePage(driver , utilities);
		hp.scrollTOFooterText();
	}
	
}
