package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.ElementAttributeType;
import pages.Searchpage;


public class Searchtest {

	WebDriver driver;
	public Searchpage Searchobj;
	
	
	
	@BeforeClass
	public void useropenurl()
	{
		driver=DriverFactory.getDriver();
	    BrowserActions.navigateToURL(driver,"https://www.google.com/");
		Searchobj=new Searchpage(driver);
	
	}
	
	
	@Test
	public void usersignintest()
	{
		Searchobj.usersearch("selenium webdriver");
		Assertions.assertEquals("What is Selenium Web Driver? Definition of Selenium Web ...",Searchobj.getsucesssearch());
		Assertions.assertElementAttribute(driver,Searchobj.getsuccesslocat(),ElementAttributeType.TEXT,"What is Selenium Web Driver? Definition of Selenium Web ...");

	}
	
	
	
	
	
	
	
	
	
	
	
	
}

