package Allbrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Firefox {
	   public WebDriver driver;
	   String baserurl="http://localhost:8080/#/";
	@Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
//	  System.setProperty("webdriver.gecko.driver ", "C:\\Users\\JIAMING.YANG\\AppData\\Local\\Mozilla Firefox");
	  driver=new FirefoxDriver();
	  driver.get(baserurl);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
