package Data_provider_TestUntil;

import org.testng.annotations.Test;

import Data_provider_PageUntil.Page_Until;

import org.testng.annotations.BeforeMethod;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.annotations.AfterMethod;

public class Test_Setversion  {
      public WebDriver driver;
  @Test
  public void setveriosn() {
	  Page_Until Setversion = new Page_Until(driver);
	  Setversion.Load();
	  Setversion.Begin();
	  Setversion.Upgrade();
	  
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
