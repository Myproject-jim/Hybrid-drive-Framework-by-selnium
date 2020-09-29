package TestDemo;

import org.testng.annotations.Test;

import cn.AutoFrame.AppMoules.Intro_Action;
import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.pagebyProperties.intro_Page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test_intro extends Base_webdriver_browser {
	String curenturl="https://www.sogou.com";
	
  @Test
  public void intro_test() {
	  driver.get(curenturl);
	  
	  Intro_Action.sogou(driver, "mk");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.chrome();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
