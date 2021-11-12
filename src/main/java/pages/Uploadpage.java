package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class Uploadpage {
	private WebDriver driver;

	public	Uploadpage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By uploadbtn=By.linkText("File Upload");
	private By choosefile=By.id("file-upload");
	private By submitbtn=By.id("file-submit");
	private By suucessupload=By.xpath("//*[@id=\"content\"]/div/h3");

		
	
		public void userupload()
		{
			ElementActions.click(driver,uploadbtn);
			ElementActions.click(driver,choosefile);
			String image_name="Little-Mermaid.jpg";
			String image_path=System.getProperty("user.dir")+"\\Uploads\\"+image_name;
			ElementActions.typeFileLocationForUpload(driver, choosefile, image_path);
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
			ElementActions.click(driver,submitbtn);
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			
		}
	
		public String getuloadtext()
		{
			return	ElementActions.getText(driver,suucessupload);
		}

		public By getuploadlocat()
		{
			return	suucessupload;
		}	

	
	
	
	
}
