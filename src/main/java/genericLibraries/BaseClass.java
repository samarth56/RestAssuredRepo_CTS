package genericLibraries;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public ReadingDataPropertyFile propertyFile;
	public WebDriverUtilities utilities;
	
	@BeforeClass
	public void setup() throws FileNotFoundException, IOException {
		driver = new ChromeDriver();
		propertyFile = new ReadingDataPropertyFile();
		utilities  = new WebDriverUtilities();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get(propertyFile.getData("url"));  // after setting timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
