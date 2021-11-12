package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class Searchpage {

	private WebDriver driver;
	
	
	public	Searchpage(WebDriver driver)
		{
			this.driver=driver;
		}

	private By signinbtn=By.name("q");
	private By searchbtn=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"); 
	public By sucesssearch =By.xpath("//*[@id=\"rso\"]/div[7]/div/div/div[1]/a/h3/span");  
	

		
		
		public void usersearch(String text)
		{
			ElementActions.type(driver,signinbtn,text);
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
			ElementActions.click(driver,searchbtn);
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		}
		public String getsucesssearch()
		{
			return	ElementActions.getText(driver,sucesssearch);
		}

		public By getsuccesslocat()
		{
			return	sucesssearch;
		}	

		
	}
