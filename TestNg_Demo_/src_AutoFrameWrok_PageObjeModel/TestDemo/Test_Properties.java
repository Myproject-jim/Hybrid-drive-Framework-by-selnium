package TestDemo;

import org.testng.annotations.Test;

import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.ObjectMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test_Properties extends Base_webdriver_browser {
  @Test
  public void propertiesfile() {
	  ObjectMap properitlsfile = new ObjectMap("E:\\eclipse\\TestNg_Demo_\\src_AutoFramwork\\ObjectMap.properties");
	  
	
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.chrome();
	  driver.get("http://www.sogou.com");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
