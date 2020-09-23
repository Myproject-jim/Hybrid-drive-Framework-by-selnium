package Data_provider_PageUntil;

import javax.swing.border.TitledBorder;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.annotations.Test;

import Data_provider_TestUntil.Test_Setversion;
import Testng_01.Base_webdriver;
import bsh.This;
//                             判断加载当前的页面是否正确
public class Page_Until extends LoadableComponent<Page_Until> {
 
	 public static WebDriver driver;
	
	  @FindBy(xpath = "query")
	  public static WebElement Enversion;
	  @FindBy(xpath = "stu")
	  public static WebElement setversin;
	  
	  @FindBy(id = "")
	  public static WebElement buildElement;
	  
	  public Page_Until(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	  
	  public static void Load() {
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		  driver = new ChromeDriver();
		
	  }
	  public static void Begin() {
		  driver.get("http://localhost:8080/#/");
	  }
	  public Page_Until Upgrade() {
		  Enversion.sendKeys("3.5.3333");
		  setversin.click();
		  return  new Page_Until(driver);
	  }
	  public WebDriver getDriver() {
		return driver;
		  
	  }
	  

   public String title="MTBF_tools";
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(driver.getTitle().contains(title));	
	}
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		this.driver.get("http://localhost:8080/#/");
	}

}
