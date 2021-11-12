package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.ElementAttributeType;

import pages.Uploadpage;



public class Uploadtest {
	
	
	WebDriver driver;
	public Uploadpage Internetobj;

	
	
	
	@BeforeClass
	public void useropenurl()
	{
		driver=DriverFactory.getDriver();
	    BrowserActions.navigateToURL(driver,"https://the-internet.herokuapp.com/");
	    Internetobj=new Uploadpage(driver);
		
	}	
	

	@Test
	public void useruploading()
	{
		Internetobj.userupload();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	    Assertions.assertEquals("File Uploaded!",Internetobj.getuloadtext());
	    Assertions.assertElementAttribute(driver,Internetobj.getuploadlocat(),ElementAttributeType.TEXT,"File Uploaded!");
	




	}
	
	
	
	
	
}
