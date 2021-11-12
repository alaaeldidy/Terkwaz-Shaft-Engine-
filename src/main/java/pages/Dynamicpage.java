package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class Dynamicpage {

	private WebDriver driver;
	
	public	Dynamicpage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By dynamicloadlink=By.linkText("Dynamic Loading");
	private By Example2=By.linkText("Example 2: Element rendered after the fact");
	private By startbtn=By.xpath("//*[@id=\"start\"]/button");
	public By sucessmsg=By.xpath("//*[@id=\"finish\"]/h4");
	
	
	public void userdynamicloading()
	{
		ElementActions.click(driver, dynamicloadlink);
		ElementActions.click(driver, Example2);
		ElementActions.click(driver, startbtn);
	    driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	   
	}
	
	public String getsucessdynamismsg()
	{
		return	ElementActions.getText(driver,sucessmsg);
	}

	public By getsuccessdynamiclocat()
	{
		return	sucessmsg;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
