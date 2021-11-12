package tests;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.ElementAttributeType;
import pages.Dynamicpage;


public class Dynamictest {

	public Dynamicpage Dynamicobj;
	WebDriver driver;
	
	@BeforeClass
	public void useropenurl()
	{
		driver=DriverFactory.getDriver();
	    BrowserActions.navigateToURL(driver,"https://the-internet.herokuapp.com/");
	    Dynamicobj=new Dynamicpage(driver);
		
	}	
	
	
	@Test
	public void userdunamicloadtest()
	{
		
		Dynamicobj.userdynamicloading();
		Assertions.assertEquals("Hello World!",Dynamicobj.getsucessdynamismsg());
		Assertions.assertElementAttribute(driver,Dynamicobj.getsuccessdynamiclocat(),ElementAttributeType.TEXT,"Hello World!");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
